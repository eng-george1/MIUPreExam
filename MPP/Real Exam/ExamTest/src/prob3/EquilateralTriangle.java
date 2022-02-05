package prob3;

public class EquilateralTriangle implements Polygon {
	private double side;
	public EquilateralTriangle(double side) {
		this.side = side;
	}
	
	public double computePerimeter() {
		return 3 * side;
	}
	
}
