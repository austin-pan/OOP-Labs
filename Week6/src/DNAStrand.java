public class DNAStrand {
	String dna;
	
	public DNAStrand(String dna) {
		this.dna = dna;
	}
	
	public boolean isValidDNA() {
		//Returns true if the DNA is valid, i.e, only contains the letters, A,T,C,G (in uppercase) and at least one of these characters.
		String bases = "ATCG";
		for(int i = 0; i < dna.length(); i++) {
			if(bases.indexOf(dna.charAt(i)) == -1)
				return false;
		}
		return dna.length() > 0;
	}
	
	public String complementWC() {
		//Returns the Watson Crick complement, which is a string representing the complementary DNA strand (i.e., the other strand in the double helix). So swap all T’s with A’s, all A’s with T’s, all C’s with G’s and all G’s with C’s.
		String comp = "";
		for(int i = 0; i < dna.length(); i++) {
			comp += this.complement(dna.charAt(i));
		}
		return comp;
	}
	
	private char complement(char c) {
		if(c == 'A')
			return 'T';
		if(c == 'T')
			return 'A';
		if(c == 'C')
			return 'G';
		return 'C';
	}
		
	public String palindromeWC() {
		//Returns the Watson Crick Palindrome, which is the reversed sequence of the complement.
		String rev = "";
		String comp = this.complementWC();
		for(int i = comp.length() - 1; i >= 0; i--) {
			rev += comp.charAt(i);
		}
		return rev;
	}
	
	public boolean containsSequence(String seq) {
		//Returns true if the DNA contains the subsequence seq.
		return dna.indexOf(seq) > -1;
	}
	
	public String toString() {
		//Returns the underlying DNA sequence string.
		return dna;
	}
}
