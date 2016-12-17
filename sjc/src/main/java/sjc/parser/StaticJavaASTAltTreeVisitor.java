/*
Copyright (c) 2011 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package sjc.parser;

import org.antlr.runtime.tree.Tree;

public class StaticJavaASTAltTreeVisitor<G> {

  G context;

  public StaticJavaASTAltTreeVisitor(final G context) {
    this.context = context;
  }

  protected boolean defaultCase(final Tree t) {
    return true;
  }

  public void visit(final Tree t) {
    switch (t.getType()) {
      case 29:
        if (visitTYPE(t)) {
          visitChildren(t);
        }
        return;
      case 39:
        if (visitT__39(t)) {
          visitChildren(t);
        }
        return;
      case 25:
        if (visitPARAM(t)) {
          visitChildren(t);
        }
        return;
      case 38:
        if (visitT__38(t)) {
          visitChildren(t);
        }
        return;
      case 16:
        if (visitINT_LIT(t)) {
          visitChildren(t);
        }
        return;
      case 37:
        if (visitT__37(t)) {
          visitChildren(t);
        }
        return;
      case 36:
        if (visitT__36(t)) {
          visitChildren(t);
        }
        return;
      case 35:
        if (visitT__35(t)) {
          visitChildren(t);
        }
        return;
      case 27:
        if (visitRETURN_STMT(t)) {
          visitChildren(t);
        }
        return;
      case 20:
        if (visitLOCAL_DECL(t)) {
          visitChildren(t);
        }
        return;
      case 30:
        if (visitUNARY_EXP(t)) {
          visitChildren(t);
        }
        return;
      case 11:
        if (visitFALSE_LIT(t)) {
          visitChildren(t);
        }
        return;
      case 18:
        if (visitINVOKE_STMT(t)) {
          visitChildren(t);
        }
        return;
      case 8:
        if (visitCLASS_DEF(t)) {
          visitChildren(t);
        }
        return;
      case 34:
        if (visitWS(t)) {
          visitChildren(t);
        }
        return;
      case 17:
        if (visitINVOKE_EXP(t)) {
          visitChildren(t);
        }
        return;
      case 70:
        if (visitT__70(t)) {
          visitChildren(t);
        }
        return;
      case 7:
        if (visitBOOLEAN(t)) {
          visitChildren(t);
        }
        return;
      case 14:
        if (visitIF_STMT(t)) {
          visitChildren(t);
        }
        return;
      case 32:
        if (visitVOID(t)) {
          visitChildren(t);
        }
        return;
      case 69:
        if (visitT__69(t)) {
          visitChildren(t);
        }
        return;
      case 5:
        if (visitBINARY_EXP(t)) {
          visitChildren(t);
        }
        return;
      case 15:
        if (visitINT(t)) {
          visitChildren(t);
        }
        return;
      case 68:
        if (visitT__68(t)) {
          visitChildren(t);
        }
        return;
      case 67:
        if (visitT__67(t)) {
          visitChildren(t);
        }
        return;
      case 31:
        if (visitVAR_REF_EXP(t)) {
          visitChildren(t);
        }
        return;
      case 28:
        if (visitTRUE_LIT(t)) {
          visitChildren(t);
        }
        return;
      case 66:
        if (visitT__66(t)) {
          visitChildren(t);
        }
        return;
      case 9:
        if (visitCOMP_UNIT(t)) {
          visitChildren(t);
        }
        return;
      case 65:
        if (visitT__65(t)) {
          visitChildren(t);
        }
        return;
      case 64:
        if (visitT__64(t)) {
          visitChildren(t);
        }
        return;
      case 63:
        if (visitT__63(t)) {
          visitChildren(t);
        }
        return;
      case 62:
        if (visitT__62(t)) {
          visitChildren(t);
        }
        return;
      case 61:
        if (visitT__61(t)) {
          visitChildren(t);
        }
        return;
      case 60:
        if (visitT__60(t)) {
          visitChildren(t);
        }
        return;
      case 33:
        if (visitWHILE_STMT(t)) {
          visitChildren(t);
        }
        return;
      case 6:
        if (visitBODY(t)) {
          visitChildren(t);
        }
        return;
      case 4:
        if (visitASSIGN_STMT(t)) {
          visitChildren(t);
        }
        return;
      case 59:
        if (visitT__59(t)) {
          visitChildren(t);
        }
        return;
      case 58:
        if (visitT__58(t)) {
          visitChildren(t);
        }
        return;
      case 57:
        if (visitT__57(t)) {
          visitChildren(t);
        }
        return;
      case 19:
        if (visitLIST(t)) {
          visitChildren(t);
        }
        return;
      case 56:
        if (visitT__56(t)) {
          visitChildren(t);
        }
        return;
      case 55:
        if (visitT__55(t)) {
          visitChildren(t);
        }
        return;
      case 13:
        if (visitID(t)) {
          visitChildren(t);
        }
        return;
      case 54:
        if (visitT__54(t)) {
          visitChildren(t);
        }
        return;
      case 53:
        if (visitT__53(t)) {
          visitChildren(t);
        }
        return;
      case 52:
        if (visitT__52(t)) {
          visitChildren(t);
        }
        return;
      case 51:
        if (visitT__51(t)) {
          visitChildren(t);
        }
        return;
      case 10:
        if (visitEND(t)) {
          visitChildren(t);
        }
        return;
      case 50:
        if (visitT__50(t)) {
          visitChildren(t);
        }
        return;
      case 22:
        if (visitMETHOD_DECL(t)) {
          visitChildren(t);
        }
        return;
      case 26:
        if (visitPAREN_EXP(t)) {
          visitChildren(t);
        }
        return;
      case 24:
        if (visitOPTION(t)) {
          visitChildren(t);
        }
        return;
      case 23:
        if (visitNUM_INT(t)) {
          visitChildren(t);
        }
        return;
      case 49:
        if (visitT__49(t)) {
          visitChildren(t);
        }
        return;
      case 12:
        if (visitFIELD_DECL(t)) {
          visitChildren(t);
        }
        return;
      case 48:
        if (visitT__48(t)) {
          visitChildren(t);
        }
        return;
      case 47:
        if (visitT__47(t)) {
          visitChildren(t);
        }
        return;
      case 46:
        if (visitT__46(t)) {
          visitChildren(t);
        }
        return;
      case 45:
        if (visitT__45(t)) {
          visitChildren(t);
        }
        return;
      case 44:
        if (visitT__44(t)) {
          visitChildren(t);
        }
        return;
      case 43:
        if (visitT__43(t)) {
          visitChildren(t);
        }
        return;
      case 42:
        if (visitT__42(t)) {
          visitChildren(t);
        }
        return;
      case 41:
        if (visitT__41(t)) {
          visitChildren(t);
        }
        return;
      case 21:
        if (visitMAIN_DECL(t)) {
          visitChildren(t);
        }
        return;
      case 40:
        if (visitT__40(t)) {
          visitChildren(t);
        }
        return;
      default:
        defaultCase(t);
    }
  }

  protected boolean visitASSIGN_STMT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitBINARY_EXP(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitBODY(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitBOOLEAN(final Tree t) {
    return defaultCase(t);
  }

  protected void visitChildren(final Tree t) {
    final int count = t.getChildCount();
    for (int i = 0; i < count; i++) {
      visit(t.getChild(i));
    }
  }

  protected boolean visitCLASS_DEF(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitCOMP_UNIT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitEND(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitFALSE_LIT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitFIELD_DECL(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitID(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitIF_STMT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitINT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitINT_LIT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitINVOKE_EXP(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitINVOKE_STMT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitLIST(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitLOCAL_DECL(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitMAIN_DECL(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitMETHOD_DECL(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitNUM_INT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitOPTION(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitPARAM(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitPAREN_EXP(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitRETURN_STMT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__35(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__36(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__37(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__38(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__39(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__40(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__41(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__42(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__43(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__44(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__45(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__46(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__47(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__48(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__49(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__50(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__51(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__52(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__53(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__54(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__55(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__56(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__57(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__58(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__59(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__60(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__61(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__62(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__63(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__64(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__65(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__66(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__67(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__68(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__69(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitT__70(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitTRUE_LIT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitTYPE(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitUNARY_EXP(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitVAR_REF_EXP(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitVOID(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitWHILE_STMT(final Tree t) {
    return defaultCase(t);
  }

  protected boolean visitWS(final Tree t) {
    return defaultCase(t);
  }
}
