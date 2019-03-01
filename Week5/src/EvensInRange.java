public class EvensInRange {
	public static void main(String y[]) {
		int start = Integer.parseInt(y[0]);
		int end = Integer.parseInt(y[1]);
		if (start <= end) {
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println(start + " cannot be greater than " + end);
		}
	}
}