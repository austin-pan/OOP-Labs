public class OneTimePadEncipher {
	private static final String alph = "abcdefghijklmnopqrstuvwxyz";
	
	public static int charToInt(char l) {
		// Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
		if(alph.indexOf(l) > -1)
			return alph.indexOf(l);
		return alph.toUpperCase().indexOf(l);
	}

	public static char intToChar(int i) {
		// Should convert an integer to a character, for example 0 -> 'a', b -> '1'
		// it should always return lower case char
		if(i < 0)
			return ' ';
		return alph.charAt(i % 26);
	}

	public static boolean isAlpha(char c) {
		// You do not need to implement this method, but you may find it useful.
		return alph.indexOf(c) > -1  ||  alph.toUpperCase().indexOf(c) > -1;
	}

	public static String encipher(String original, String onetimepad) {
		int[] orig = new int[original.length()];
		int[] otp = new int[onetimepad.length()];
		for(int i = 0; i < orig.length; i++)
			orig[i] = charToInt(original.charAt(i));
		for(int i = 0; i < otp.length; i++)
			otp[i] = charToInt(onetimepad.charAt(i));
		
		int[] codes = new int[orig.length];
		for(int i = 0; i < codes.length; i++) {
			if(orig[i] < 0)
				codes[i] = -1;
			else
				codes[i] = orig[i] + otp[i];
		}
		
		String enciph = "";
		for(int i = 0; i < codes.length; i++)
			enciph += intToChar(codes[i]);
		return enciph;
	}

	public static void main(String[] args) {
		String ciphertext = encipher("IS THIS SECURE", "KEEPMEVERYVERYSAFE");
		System.out.print(ciphertext);
	}

}