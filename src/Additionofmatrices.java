import java.util.Scanner;

public class Additionofmatrices {

	public static void main(String[] args) {
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] c = new int[2][2];

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST MATRICES");

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();

			}

		}

		System.out.println("ENTER SECOND MATRICES");
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {
				b[i][j] = sc.nextInt();

			}

		}
		System.out.println("FIRST MATRICES IS");
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("SECOND MATRICES IS");
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.print(b[i][j] + "  ");
			}
			System.out.println();

		}
		System.out.println("AADDITION OF TWO MATRICES");
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "   ");

			}
			System.out.println();

		}

	}
}
