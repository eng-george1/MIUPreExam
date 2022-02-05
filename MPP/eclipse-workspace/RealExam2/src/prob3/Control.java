package prob3;

/** This code must be rewritten so that computeSum is implemented
 *  using polymorphism
 */
public class Control {
    //expected:  29.0
	public static void main(String[] args) {
		Object[] ObjectShapes = {
				new Pentagon(2.0),
				new EquilateralTriangle(3.0),
				new Rectangle(2.0, 3.0)
		};
		System.out.println("Sum of perimeters is " + computeSum(ObjectShapes));

		Polygon[] PolygonShapes = {
				new Pentagon(2.0),
				new EquilateralTriangle(3.0),
				new Rectangle(2.0, 3.0)
		};
		System.out.println("Sum of perimeters is " + computeSum(PolygonShapes));
		

	}
	
	public static double computeSum(Object[] shapes) {
		double sum = 0.0;
		for(int i = 0; i < shapes.length; ++i) {
			Polygon polygon = (Polygon) shapes[i];
			sum += polygon.computePerimeter();
		}
		return sum;
	}
	
	public static double computeSum(Polygon[] shapes) {
		double sum = 0.0;
		for(int i = 0; i < shapes.length; ++i) {
			Polygon polygon = (Polygon) shapes[i];
			sum += polygon.computePerimeter();
		}
		return sum;
	}

}
	