package prob3;

public class Pentagon implements Polygon {
	private double side;
	public Pentagon(double side) {
		this.side = side;
	}
	
	public double computePerimeter() {
		return 5 * side;
	}
}
