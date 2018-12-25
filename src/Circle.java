public class Circle {
	private int xCenter;
	private int yCenter;
	private int radius;
	public static final double PI = 3.14159;

	public Circle(int x, int y, int r) {
		xCenter = x;
		yCenter = y;
		radius = r;
	}

	// return the area of this circle
	public double area() {
		return radius * radius * PI;
	}

	// return the circumference of this circle
	public double circumference() {
		return 2 * PI * radius;
	}

	// returns true if this Circle overlaps Circle other
	// and false otherwise
	public boolean overlap(Circle other) {
		// implementation not shown
	}

	// increase the radius by n units
	public void grow(int n) {
		// implementation not shown
	}

	public int getX() {
		return xCenter;
	}

	public int getY() {
		return yCenter;
	}

	public int getRadius() {
		return radius;
	}
	
}