public class Vector3D {
	private double x, y, z;
	public static void main(String[] args) {
		System.out.println(new Vector3D(0, 10, 0).getPhi());
	}
	
	public Vector3D(double x, double y, double z) {
		//Class constructor
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getR() {
		//Return the radial distance r.
		double d = Math.sqrt(x*x + y*y + z*z);
		return d;
	}
	
	public double getTheta() {
		//Return the inclination θ.
		double theta = Math.acos(z / this.getR());
		return theta;
	}
	
	public double getPhi() {
		//Return the azimuth ϕ.
		double phi = Math.atan(y / x);
		return phi;
	}
	
	public static Vector3D add(Vector3D lhs, Vector3D rhs) {
		//Return the sum of two 3D vectors.
		double newX = lhs.getR() * Math.sin(lhs.getTheta()) * Math.cos(lhs.getPhi()) + rhs.getR() * Math.sin(rhs.getTheta()) * Math.cos(rhs.getPhi());
		double newY = lhs.getR() * Math.sin(lhs.getTheta()) * Math.sin(lhs.getPhi()) + rhs.getR() * Math.sin(rhs.getTheta()) * Math.sin(rhs.getPhi());
		double newZ = lhs.getR() * Math.cos(lhs.getTheta()) + rhs.getR() * Math.cos(rhs.getTheta());
		return new Vector3D(newX, newY, newZ);
	}
	
	public static Vector3D subtract(Vector3D lhs, Vector3D rhs) {
		//Return the difference of two 3D vectors.
		double newX = lhs.getR() * Math.sin(lhs.getTheta()) * Math.cos(lhs.getPhi()) - rhs.getR() * Math.sin(rhs.getTheta()) * Math.cos(rhs.getPhi());
		double newY = lhs.getR() * Math.sin(lhs.getTheta()) * Math.sin(lhs.getPhi()) - rhs.getR() * Math.sin(rhs.getTheta()) * Math.sin(rhs.getPhi());
		double newZ = lhs.getR() * Math.cos(lhs.getTheta()) - rhs.getR() * Math.cos(rhs.getTheta());
		return new Vector3D(newX, newY, newZ);
	}
	public static Vector3D scale( Vector3D v, double scaleFactor) {
		//Return the result of scaling v by scalefactor.
		double newX = scaleFactor * v.getR() * Math.sin(v.getTheta()) * Math.cos(v.getPhi());
		double newY = scaleFactor * v.getR() * Math.sin(v.getTheta()) * Math.sin(v.getPhi());
		double newZ = scaleFactor * v.getR() * Math.cos(v.getTheta());
		return new Vector3D(newX, newY, newZ);
	}
}
