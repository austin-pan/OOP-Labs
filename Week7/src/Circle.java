public class Circle {
	private Point2DDouble centre;
	private double radius;
	
	public Circle(Point2DDouble centre, double radius) {
		//Class constructor.
		this.centre = centre;
		this.radius = radius;
	}
	
	public Circle() {
		//Class constructor. The centre is a point at (0, 0) and the radius is 1.
		this.centre = new Point2DDouble(0, 0);
		this.radius = 1;
	}
	
	public boolean isPointInside(Point2DDouble pt) {
		//Returns true if the circle contains the point pt.
		//You can compute this by calculating the distance between the pt and the circle’s centre, and seeing if this is smaller than the radius.
		double distFromCent = Math.sqrt(Math.pow(pt.getX() - this.centre.getX(), 2) + Math.pow(pt.getY() - this.centre.getY(), 2));
		return distFromCent < radius;
	}
}
