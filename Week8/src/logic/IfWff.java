package logic;

public class IfWff extends BinaryWff {

	public IfWff(Wff left, Wff right) {
		super(left, right);
		this.setOp(Operator.IF);
	}

	@Override
	public boolean eval(Valuation val) {
		// TODO Auto-generated method stub
		return !left.eval(val) || right.eval(val);
	}
	
}
