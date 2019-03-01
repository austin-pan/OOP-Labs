package logic;

public class NotWff extends Wff {
	private Wff curr;
	private Operator op;
	public NotWff(Wff curr) {
		this.curr = curr;
		this.op = Operator.NEG;
	}

	@Override
	public boolean eval(Valuation val) {
		// TODO Auto-generated method stub
		return !curr.eval(val);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return op + curr.toString();
	}
	
}
