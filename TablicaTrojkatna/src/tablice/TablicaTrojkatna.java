package tablice;

public class TablicaTrojkatna {

	public static void main(String[] args) {
		final int N = 10;
		int[][] triangleArray = new int[N + 1][];

		for (int i = 0; i < triangleArray.length; i++) {
			triangleArray[i] = new int[i + 1];
			for (int j = 0; j < triangleArray[i].length; j++) {
				triangleArray[i][j] = j;
			}
		}

		for (int i = 0; i < triangleArray.length; i++) {
			for (int j = 0; j < triangleArray[i].length; j++)
				System.out.print(triangleArray[i][j] + " ");
			System.out.println();
		}
	}
}
