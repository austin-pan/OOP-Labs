public class OneTimePadDecipher {
	public static String decipher(String encipheredText, String oneTimePad) {
		int[] decode = new int[encipheredText.length()];
		for(int i = 0; i < decode.length; i++) {
			if(encipheredText.charAt(i) == ' ')
				decode[i] = -1;
			else
				decode[i] = (OneTimePadEncipher.charToInt(encipheredText.charAt(i)) - OneTimePadEncipher.charToInt(oneTimePad.charAt(i)) + 26) % 26;
		}
		
		String deciph = "";
		for(int i=0; i < decode.length; i++) {
			deciph += OneTimePadEncipher.intToChar(decode[i]);
		}
		return deciph.toUpperCase();
	}
}