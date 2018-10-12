package ppj.git;

import java.util.Scanner;

public class Circle2Radii {  //comparison of radiuses of two circles

	private double r1 = 0.0;
	private double r2 = 0.0;

	public Circle2Radii(double r1, double r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	public void compareRads() {

		if (r1 < r2) {
			System.out.println("-1");
		} else if (r1 == r2) {
			System.out.println("0");
		} else if (r1 > r2) {
			System.out.println("1");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Podaj wartosc promienia pierwszego okregu: ");
		double r1 = Double.parseDouble(in.next());

		System.out.print("Podaj wartosc promienia drugiego okregu: ");
		double r2 = in.nextDouble();
		in.close();

		Circle2Radii cr = new Circle2Radii(r1, r2);
		cr.compareRads();
	}

}
