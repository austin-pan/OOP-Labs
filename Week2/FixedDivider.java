public class FixedDivider {
	public static void main(String[] args) {
		double num = Double.parseDouble(args[0]);
		double den = Double.parseDouble(args[1]);
		
		double quotient = num/den;
		System.out.println(quotient);
	}
}