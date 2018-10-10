package ppj.git;

public class TablMnoz {

	public static void main(String[] args) {
		int[][] tab = new int[10][10];
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				tab[i][j] = (i + 1) * (j + 1);
				System.out.printf("%4d", tab[i][j]);
			}
		}
	}
}