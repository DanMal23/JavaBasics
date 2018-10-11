package ppj;

public class Circle {
	double radius = 0.0;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.141592 * radius * radius;
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(7);
		Circle c2 = new Circle(8);
		double area1 = c1.area(); // can't be private
		double area2 = c2.area();
		System.out.printf("Powierzchnia (promien=7): %.2f", area1);
		System.out.printf("\nPowierzchnia(promien=8): %.2f", area2);
	}
}
	
