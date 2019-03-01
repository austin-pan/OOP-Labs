import java.util.HashMap;
import java.util.Iterator;

public class WordCounter {
	private HashMap<Integer, Integer> wc;
	
	public WordCounter(String[] tokens) {
		//Class constructor. When a WordCounter is created, it calls wordLengthFreq() on the input tokens.
		this.wordLengthFreq(tokens);
	}
	
	public void wordLengthFreq(String[] tokens) {
		//Replace the object’s frequency distribution with information about the lengths of the strings in tokens.
		wc = new HashMap<Integer, Integer>();
		for(int i = 0; i < tokens.length; i++) {
			int currLength = tokens[i].length();
			if(wc.containsKey(currLength)) {
				wc.put(currLength, wc.get(currLength) + 1);
			} else {
				wc.put(currLength, 1);
			}
		}
	}
	
	public HashMap<Integer, Integer> getFreqDist() {
		//Returns the frequency distribution as a HashMap.
		return wc;
	}
	
	public int maxVal() {
		//Returns the highest value in the frequency distribution.
		int max = 0;
		Iterator<Integer> it = wc.keySet().iterator();
		while(it.hasNext()) {
			int curr = wc.get(it.next());
			if(curr > max) {
				max = curr;
			}
		}
		return max;
	}
	
	public double[] map2array() {
		/* Convert the frequency distribution to a normalized array of doubles. 
		 * Each (integer) key of the frequency distribution corresponds to an index into the array, and the value for that key corresponds to the element at the index. 
		 * Convert the values into percentages (where the maximum value of the distribution is 100%). */
		int max = 0;
		Iterator<Integer> it = wc.keySet().iterator();
		while(it.hasNext()) {
			int curr = it.next();
			if(curr > max) {
				max = curr + 1;
			}
		}
		
		double[] dist = new double[max]; //account for length 0 and to include the max length
		for(int i = 0; i < dist.length; i++) {
			if(wc.containsKey(i)) {
				dist[i] = wc.get(i) / (double) this.maxVal() * 100;
			} else {
				dist[i] = 0;
			}
		}
		
		return dist;
	}
	
	public static void main(String[] args) {
		Tokenizer tokenizer = new Tokenizer("melville-moby_dick.txt");
		String[] tokens = tokenizer.getTokens();

		WordCounter wordCounter = new WordCounter(tokens);
		System.out.println(wordCounter.getFreqDist());
		double[] points = wordCounter.map2array();

		int n = points.length;
		StdDraw.clear();
		StdDraw.setXscale(0, n - 1);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(0.5 / n);
		for (int i = 0; i < n; i++) {
		    StdDraw.line(i, 0, i, points[i]);
		}
	}
}
