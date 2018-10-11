package ppj;

public class Circle2 {
	private double radius = 0.0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle2() {
		this.setRadius(radius);
	}
	public double area() {
		return 3.141592 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle2 cl1 = new Circle2();
		Circle2 cl2 = new Circle2();
		cl1.setRadius(5);
		cl2.setRadius(10);
		System.out.printf("Powierzchnia (promien="+ cl1.getRadius()+") = %.2f" ,cl1.area());
		System.out.printf("\nPowierzchnia (promien="+ cl2.getRadius()+") = %.2f" ,cl2.area());
	}
}
