package ppj.git;

import java.util.Scanner;

public class ScannerDoubles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Podaj pierwsz� liczb�: ");
		double dbl1 = Double.parseDouble(in.next());
		
		System.out.print("Podaj drug� liczb�: ");
		double dbl2 = in.nextDouble();		
		in.close();
		
		double il = dbl1*dbl2;
		System.out.println("Iloczyn = "+il);	
	}
}
