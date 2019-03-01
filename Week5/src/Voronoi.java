import java.awt.Color;

public class Voronoi {

	public static double pointDist(Point2D point1, Point2D point2) {
		double dist = Math
				.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
		return dist;
	}

	public static int findClosestPoint(Point2D point, Point2D[] sites) {
		double minDist = pointDist(point, sites[0]);
		int closestIndex = 0;
		for (int i = 1; i < sites.length; i++) {
			double currDist = pointDist(point, sites[i]);
			if (minDist > currDist) {
				minDist = currDist;
				closestIndex = i;
			}
		}
		return closestIndex;
	}

	public static int[][] buildVoronoiMap(Point2D[] sites, int height, int width) {
		int[][] map = new int[height][width];
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				map[r][c] = findClosestPoint(new Point2D(r, c), sites);
			}
		}
		return map;
	}

	public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
		int width = indexMap.length;
		int height = indexMap[0].length;

		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		
		for (int r = 0; r < indexMap.length; r++) {
			for (int c = 0; c < indexMap[r].length; c++) {
				StdDraw.setPenColor(colors[indexMap[r][c]]);
				StdDraw.filledCircle(r, c, 3);
			}
		}
		for(int i = 0; i < sites.length; i++) {
			StdDraw.setPenColor();
			StdDraw.filledCircle(sites[i].getX(), sites[i].getY(), 3);
		}
	}

	public static void main(String[] args) {
		int width = 200;
		int height = 200;

		int nSites = 5;
		Point2D[] sites = new Point2D[nSites];
		sites[0] = new Point2D(50, 50);
		sites[1] = new Point2D(100, 50);
		sites[2] = new Point2D(50, 100);
		sites[3] = new Point2D(125, 50);
		sites[4] = new Point2D(100, 175);

		Color[] colors = new Color[nSites];
		colors[0] = Color.BLUE;
		colors[1] = Color.GREEN;
		colors[2] = Color.YELLOW;
		colors[3] = Color.ORANGE;
		colors[4] = Color.MAGENTA;

		int[][] indexmap = buildVoronoiMap(sites, width, height);
		plotVoronoiMap(sites, colors, indexmap);

	}

}