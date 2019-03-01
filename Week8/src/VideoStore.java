import java.util.ArrayList;

public class VideoStore {
	private ArrayList<Video> videos;
	
	public static void main(String[] args) {
		VideoStore videoStore = new VideoStore();
		
		videoStore.addVideo("Tron");
		videoStore.addVideo("Tron");
	}
	
	public VideoStore() {
		videos = new ArrayList<Video>();
	}
	
	public boolean addVideo(String title) {
		//Add a video by title to the inventory. If there is already a video with that title in the store’s inventory, print out an error message and return false. 
		//Otherwise, add a new video with that title and return true.
		if(this.containsTitle(title)) {
			System.out.println("Tron is already in stock.");
			return false;
		}
		videos.add(new Video(title));
		return true;
	}
	
	public Video getVideo(String title) {
		//Return the video whose title is title. If there is no video in the inventory with that title, print out an error message and return null.
		int index = this.indexOfTitle(title);
		if(index == -1) {
			System.out.println("Sorry, cannot find the requested video in the catalogue");
			return null;
		}
		return videos.get(index);
	}
	
	public boolean checkOutVideo(String title) {
		//Check out a video by title. If there is a video with that title not already checked out, change its status to checked out and return true. 
		//Otherwise, print out an appropriate error message and return false.
		Video curr = this.getVideo(title);
		if(curr == null) {
			return false;
		}
		if(curr.isCheckedOut()) {
			System.out.println(curr + " is already checked out.");
			return false;
		}
		curr.checkOut();
		return true;
	}
	
	public boolean containsTitle(String title) {
		return indexOfTitle(title) != -1;
	}
	
	public int indexOfTitle(String title) {
		for(int i = 0; i < videos.size(); i++) {
			if(videos.get(i).getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean returnVideo(Video video) {
		//Return the result of calling the returnToStore() method on the video.
		int index = videos.indexOf(video);
		if(index == -1) {
			System.out.println("Sorry, this video did not come from this store");
			return false;
		}
		return video.returnToStore();
	}
	
	public void rateVideo(Video video, int rating) {
		//Add the rating rating to the video.
		video.addRating(rating);
	}
	
	public double getAverageRatingForVideo(Video video) {
		//Return the average user rating for this video as a double.
		return video.getAverageRating();
	}
	
	public Video[] getCheckedOut() {
		//Return an array of type Video[] consisting of all videos in the store which have been checked out.
		ArrayList<Video> temp = new ArrayList<Video>();
		for(int i = 0; i < videos.size(); i++) {
			if(videos.get(i).isCheckedOut())
				temp.add(videos.get(i));
		}
		return temp.toArray(new Video[temp.size()]);
	}
	
	public Video mostPopular() {
		//Return the video which has the highest average ranking. If there is a tie, return the first one. If the store is not stocking any videos, return null;
		double maxRating = videos.get(0).getAverageRating();
		int indexMax = 0;
		for(int i = 1; i < videos.size(); i++) {
			double currRating = videos.get(i).getAverageRating();
			if(currRating > maxRating) {
				maxRating = currRating;
				indexMax = i;
			}
		}
		return videos.get(indexMax);
	}
}
