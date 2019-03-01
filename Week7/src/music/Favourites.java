package music;

import java.util.ArrayList;

public class Favourites {
	private ArrayList<MusicTrack> favourites = new ArrayList<MusicTrack>();
	
	public void addTrack(String artist, String title) {
		MusicTrack curr = new MusicTrack(artist, title);
		favourites.add(curr);
	}
	
	public void showFavourites() {
		for(int i = 0; i < favourites.size(); i++) {
			if(favourites.get(i) != null)
				System.out.println(favourites.get(i));
		}
	}
}
