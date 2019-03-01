import java.awt.Color;

public class ImageEditor1 {

	public static double luminance(Color color) {
		//Return a double that represents the luminance of color. This is given by the following function of color‘s red (R), 
		//green (G) and blue (B) values: luminance=0.299×R+0.587×G+0.114×B.
		//To obtain the RGB values of color, you will need to call its instance methods getRed(), getGreen() and getBlue().
		double luminance = 0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue();
		return luminance;
	}
	
	public static Color toGrey(Color color) {
		//Return a new Color object whose RGB values are all equal to the luminance of the input color. 
		//To get appropriate values, round the luminance value and cast it to an int.
		int lum = (int) Math.round(luminance(color));
		//System.out.println(luminance(color));
		return new Color(lum, lum, lum);
	}
	
	public static Picture makeGreyscale(Picture pic) {
		//Return a new Picture object which results from converting every pixel in pic to its greyscale equivalent. 
		//Remember that a Picture is just a 2D array of Color objects, and the pixel with coordinates (i, j) is accessed via the call pic.get(i, j).
		Picture greyPic = new Picture(pic.width(), pic.height());
		for(int r = 0; r < pic.height(); r++) {
			for(int c = 0; c < pic.width(); c++) {
				greyPic.set(c, r, toGrey(pic.get(c, r)));
			}
		}
		
		return greyPic;
	}
	
	public static void main(String[] args) {
		Picture p = new Picture("lion2.jpg"); // or use any other colour image
		Picture greyscale = makeGreyscale(p);
		greyscale.show();
	}
}
