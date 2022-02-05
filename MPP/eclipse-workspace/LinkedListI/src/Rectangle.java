
public class Rectangle implements Shape {
	double hight;
	double width;

	Rectangle(double hight, double width) {
		this.hight = hight;
		this.width = width;
	}

	public double calculateArea() {
		return hight * width;
	}
}
