package tables;

import java.util.Scanner;

public class TablTrScanParam {

	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Podaj wartoœæ parametru 'n': ");
		n = Integer.parseInt(s.next());
		s.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+ ",  ");
			}
			System.out.println();
		}
	}
}