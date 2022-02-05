package Polymorphism_March_2018;

public class EconomyClass implements BoardingTime {
	private double capacity;

	public EconomyClass(double capacity) {
		super();
		this.capacity = capacity;
	}

	public double computeBoardingTime(){

		return capacity/10 + Math.sqrt(capacity);

	}
}
