public class Favourites {
	private MusicTrack[] favourites = new MusicTrack[5];
	private int addIndex = 0;
	
	public void addTrack(String artist, String title) {
		MusicTrack curr = new MusicTrack(artist, title);
		if(addIndex < favourites.length) {
			favourites[addIndex] = curr;
			addIndex++;
		} else {
			System.out.println("Sorry, can't add: " + curr);
			System.out.println();
		}
	}
	
	public void showFavourites() {
		for(int i = 0; i < favourites.length; i++) {
			if(favourites[i] != null)
				System.out.println(favourites[i]);
		}
	}
}
