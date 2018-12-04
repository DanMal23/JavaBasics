package ppj.git;

import java.util.Scanner;

public class WynagrodzPracown {

	public static void main(String[] args) {
		int przepracGodz;
		double minPlacaNaGodz = 12.0;
		double stawkaZaGodz;
		int normGodzTyg = 40;
		int maxGodzTyg = 60;
		int dniPracyWMcu = 21;
		int dniPracyWTyg = 5;

		Scanner scr = new Scanner(System.in);
		System.out.print("Podaj ilosc przepracowanych godzin: ");
		przepracGodz = Integer.parseInt(scr.next());
		System.out.print("Podaj stawke za godzine: ");
		stawkaZaGodz = scr.nextInt();
		scr.close();

		if (przepracGodz > maxGodzTyg) {
			System.out.println("Liczba godzin pracy w tygodniu nie moze przekroczyc 60.");

		} else if (stawkaZaGodz < minPlacaNaGodz) {
			System.out.println("Stawka za godzine nie moze byc mniejsza niz 12.00 PLN.");
		} else if (przepracGodz <= normGodzTyg) {
			double wynagrTyg = przepracGodz * stawkaZaGodz;
			System.out.printf("Wynagrodzenie tygodniowe: %.2f", wynagrTyg);
			System.out.print(" PLN");
			double dniowka = wynagrTyg / dniPracyWTyg;
			System.out.printf("\nWynagrodzenie za dzien pracy: %.2f", dniowka);
			System.out.printf("\nSrednie wynagrodzenie mieseczne: %.2f", dniowka * dniPracyWMcu);
			System.out.print(" PLN");
		} else if (przepracGodz <= maxGodzTyg) {
			double zaNadGodz = stawkaZaGodz * 1.5;
			double wynagrTygZNadg = (przepracGodz - normGodzTyg) * zaNadGodz + normGodzTyg * stawkaZaGodz;
			System.out.printf("Wynagrodzenie tygodniowe (w tym nadgodziny): %.2f", wynagrTygZNadg);
			double dniowkaN = wynagrTygZNadg / dniPracyWTyg;
			System.out.printf("\nWynagrodzenie za dzien pracy: %.2f", dniowkaN);
			System.out.printf("\nWynagrodzenie miesieczne: %.2f", dniowkaN * dniPracyWMcu);
			System.out.print(" PLN");

		}

	}
}
