package sjc.analysis;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import sjc.annotation.NonNull;
import sjc.symboltable.SymbolTable;
import sjc.util.Pair;
import sjc.util.Util;

/**
 * An instance of MonotonicDataFlowFramework to compute reaching definition. The
 * lattice element of this analysis is a {@link Pair} of {@link String} which
 * represents a field, a parameter, or a local variable name, and
 * {@link FieldDeclaration}, {@link SingleVariableDeclaration},
 * {@link Assignment} (in {@link ExpressionStatement}), respectively, which
 * indicates the last definition of the variable (i.e., a field or a method
 * parameter declaration is considered as the field or the parameter initial
 * definition).
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ReachingDefinitionAnalysis extends
    MonotonicDataFlowFramework<Pair<String, ASTNode>> {
  protected Map<ASTNode, Object> symbolMap;

  /**
   * Create a Reaching Definition analysis with the given {@link SymbolTable}
   * and {@link CFG}.
   * 
   * @param symbolTable
   *          The {@link SymbolTable}.
   * @param cfg
   *          The {@link CFG}.
   */
  public ReachingDefinitionAnalysis(@NonNull final SymbolTable symbolTable,
      @NonNull final CFG cfg) {
    super(cfg, true, true);
    assert symbolTable != null;
    this.symbolMap = symbolTable.symbolMap;
  }

  @Override
  public void computeFixPoint() {
    final Set<Pair<String, ASTNode>> init = new HashSet<>();
    for (final ASTNode n : this.symbolMap.keySet()) {
      if (n instanceof SimpleName) {
        final Object o = this.symbolMap.get(n);
        if (o instanceof FieldDeclaration) {
          init.add(new Pair<>(((SimpleName) n).getIdentifier(),
              (FieldDeclaration) o));
        }
      }
    }
    for (final Object o : this.cfg.md.parameters()) {
      final SingleVariableDeclaration svd = (SingleVariableDeclaration) o;
      init.add(new Pair<>(svd.getName().getIdentifier(), svd));
    }
    for (final Object o : this.cfg.md.getBody().statements()) {
      if (o instanceof VariableDeclarationStatement) {
        final VariableDeclarationStatement vdf = (VariableDeclarationStatement) o;
        init.add(new Pair<>(((VariableDeclarationFragment) vdf
            .fragments().get(0)).getName().getIdentifier(), vdf));
      } else {
        break;
      }
    }
    computeFixPoint(init);
  }

  @Override
  protected Set<Pair<String, ASTNode>> gen(
      final Set<Pair<String, ASTNode>> set, final Statement s) {
    final Set<Pair<String, ASTNode>> result = new HashSet<>();
    final String lhsLocalName = getLHSVarName(s);
    if (lhsLocalName != null) {
      result.add(new Pair<>(lhsLocalName, s));
    }
    return result;
  }

  @Override
  public String getAnalysisName() {
    return "Reaching Definition";
  }

  protected String getLHSVarName(final ASTNode s) {
    if (s instanceof ExpressionStatement) {
      final ExpressionStatement es = (ExpressionStatement) s;
      final Expression e = es.getExpression();
      if (e instanceof Assignment) {
        final Assignment a = (Assignment) e;
        final Expression lhs = a.getLeftHandSide();
        final SimpleName sn = (SimpleName) lhs;
        return sn.getIdentifier();
      }
    }
    return null;
  }

  @Override
  protected Set<Pair<String, ASTNode>> kill(
      final Set<Pair<String, ASTNode>> set, final Statement s) {
    final Set<Pair<String, ASTNode>> result = new HashSet<>();
    final String lhsLocalName = getLHSVarName(s);
    if (lhsLocalName != null) {
      for (final Pair<String, ASTNode> p : set) {
        if (p.first.equals(lhsLocalName)) {
          result.add(p);
        }
      }
    }
    return result;
  }

  @Override
  public String toString(final Pair<String, ASTNode> e) {
    return Util.getFirstLine(e.second);
  }
}
