package ast;

public enum BinaryOp {
  ADD {
    @Override
    public String toString() {
      return "+";
    }
  },
  SUB {
    @Override
    public String toString() {
      return "-";
    }
  },
  MUL {
    @Override
    public String toString() {
      return "*";
    }
  },
  DIV {
    @Override
    public String toString() {
      return "/";
    }
  },
  REM {
    @Override
    public String toString() {
      return "%";
    }
  }
}
