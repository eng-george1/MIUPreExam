package prob3;

public class Rectangle implements Polygon {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double computePerimeter() {
		return 2 * length + 2 * width;
	}
}
