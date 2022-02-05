
public class Circle implements Shape {
double side;

 Circle(double side)
{
	this.side=side;
}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*side*side*Math.PI;
	}

}
