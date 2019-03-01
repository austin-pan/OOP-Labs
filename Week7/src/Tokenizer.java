public class Tokenizer {
	private String[] tokens;
	
	public Tokenizer() {
		//No argument class constructor. A tokenizer created with this constructor should have an empty list of tokens as data.
		tokens = new String[0];
	}
	
	public Tokenizer(String fname) {
		//Class constructor. This calls tokensFromFile() on the constructor’s argument.
		this.tokensFromFile(fname);
	}
	
	public void tokensFromFile(String fname) {
		//Uses the In library from stdlib.zip to read the contents of the file fname into a string via a call to Ins readAll() method. The method tokenize() is then called on this string.
		In file = new In(fname);
		String s = file.readAll();
		this.tokenize(s);
	}
	
	public void tokenize(String str) {
		//Create an array of tokens of type String[].
		tokens = str.split("\\W+");
	}
	
	public String[] getTokens() {
		//Return the tokens
		return tokens;
	}
	
	public int getNumberTokens() {
		//Return the number of tokens.
		return tokens.length;
	}
}
