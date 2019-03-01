package logic;

public class AndWff extends BinaryWff {

	public AndWff(Wff left, Wff right) {
		super(left, right);
		this.setOp(Operator.AND);
	}

	@Override
	public boolean eval(Valuation val) {
		// TODO Auto-generated method stub
		return left.eval(val) && right.eval(val);
	}
	
}
