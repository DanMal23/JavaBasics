package ppj.git;

import java.util.Scanner;

public class ScannerDoubles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Podaj pierwszą liczbę: ");
		double dbl1 = Double.parseDouble(in.next());
		
		System.out.print("Podaj drugą liczbę: ");
		double dbl2 = in.nextDouble();		
		in.close();
		
		double il = dbl1*dbl2;
		System.out.println("Iloczyn = "+il);	
	}
}
