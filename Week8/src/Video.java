public class Video {
	private String title;
	private boolean checkedOut;
	private int totalRating, numOfRatings;
	
	public Video(String title) {
		//Class constructor
		this.title = title;
		checkedOut = false;
		totalRating = 0;
		numOfRatings = 0;
	}
	
	public String getTitle() {
		//Return the video’s title.
		return title;
	}
	
	public boolean addRating(int rating) {
		//Add a rating for the video. If rating is between 1-5 inclusive, then update the ratings for this video, keeping track of how many ratings for it have been received, and return true. 
		//Otherwise, print out an error message and return false.
		if(rating < 1 || rating > 5) {
			System.out.println(rating + " should be between 1 and 5.");
			return false;
		}
		
		totalRating += rating;
		numOfRatings++;
		return true;
	}
	
	public double getAverageRating() {
		//Return the average rating for this video. Although ratings are always integers, the average should be a double. Return zero if no ratings have been added;
		if(totalRating == 0)
			return 0;
		double avgRating = (double) totalRating / numOfRatings;
		return avgRating;
	}
		
	public boolean checkOut() {
		//If the video is already checked out, warn the user and return false. Otherwise change the status of the video to checked out, and return true.
		if(checkedOut) {
			System.out.println(this.toString() + " is already checked out.");
			return false;
		}
		checkedOut = true;
		return true;
	}
	
	public boolean returnToStore() {
		//If the video is not checked out, warn the user and return false. Otherwise change the status of the video to not checked out, and return true.
		if(!checkedOut) {
			System.out.println(this.toString() + " is not checked out.");
			return false;
		}
		checkedOut = false;
		return true;
	}
	
	public boolean isCheckedOut() {
		//Return the checked-out status of the video
		return checkedOut;
	}
	
	public String toString() {
		//Return a String of the form Video[title="<title>", checkedOut=<status>].
		String temp = "Video[title=\"" + title + "\", checkedOut=" + checkedOut + "]";
		return temp;
	}
}
