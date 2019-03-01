package logic;

public class OrWff extends BinaryWff {

	public OrWff(Wff left, Wff right) {
		super(left, right);
		this.setOp(Operator.OR);
	}

	@Override
	public boolean eval(Valuation val) {
		// TODO Auto-generated method stub
		return left.eval(val) || right.eval(val);
	}
	
}
