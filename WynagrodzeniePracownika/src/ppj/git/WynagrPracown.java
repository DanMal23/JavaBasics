package ppj.git;

import java.util.Scanner;

public class WynagrPracown {

	public static void main(String[] args) {
		int przepracGodz;
		// double p³acaMinNaGodz = 12.0;
		double stawkaZaGodz;
		// int normGodzTyg = 40
		// int maxGodzTyg = 60;

		Scanner scr = new Scanner(System.in);
		System.out.print("Podaj iloœæ przepracowanych godzin: ");
		przepracGodz = Integer.parseInt(scr.next());
		System.out.print("Podaj stawka za godzinê: ");
		stawkaZaGodz = scr.nextInt();
		scr.close();

		if (przepracGodz > 40) {
			double zaNadGodz = stawkaZaGodz * 1.5;
			double wynagrTygZNadg = (przepracGodz - 40) * zaNadGodz + 40 * stawkaZaGodz;
			System.out.printf("Wynagrodzenie tygodniowe (w tym nadgodziny): %.2f", wynagrTygZNadg);
			double dniowkaN = wynagrTygZNadg / 5;
			System.out.printf("\nWynagrodzenie za dzieñ pracy: %.2f", dniowkaN);
			System.out.printf("\nWynagrodzenie miesieczne: %.2f", dniowkaN * 21);
			System.out.print(" PLN");
		} else {
			double wynagrTyg = przepracGodz * stawkaZaGodz;
			System.out.printf("Wynagrodzenie tygodniowe: %.2f", wynagrTyg);
			System.out.print(" PLN");
			double dniowka = wynagrTyg / 5;
			System.out.printf("\nWynagrodzenie za dzieÅ„ pracy: %.2f", dniowka);
			System.out.printf("\nŒrednie wynagrodzenie miesiêczne: %.2f", dniowka * 21);
			System.out.print(" PLN");
		}
	}
}
