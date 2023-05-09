
public class Matricesinjava {
public static void main(String[] args) {
	int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	// check if the matrices can be multiplied
	if (a[0].length != b.length) {
	    System.out.println("Matrices cannot be multiplied");
	} else {
	    // create the result matrix
	    int[][] result = new int[a.length][b[0].length];

	    // perform matrix multiplication
	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < b[0].length; j++) {
	            int sum = 0;
	            for (int k = 0; k < b.length; k++) {
	                sum += a[i][k] * b[k][j];
	            }
	            result[i][j] = sum;
	        }
	    }

	    // print the result matrix
	    for (int i = 0; i < result.length; i++) {
	        for (int j = 0; j < result[0].length; j++) {
	            System.out.print(result[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

}
}
