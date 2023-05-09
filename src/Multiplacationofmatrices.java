
public class Multiplacationofmatrices {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }

		};
		int[][] c = new int[3][3];
		int sum = 0;
		int[][] b = { { 1, 2, 3 }, 
				{ 4, 5, 6 },
				{ 7, 8, 9 }

		};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {
					sum = sum + a[i][k] * a[k][j];
				}
				c[i][j] = sum;
				sum = 0;
				
			}
		}
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		System.out.print(c[i][j]+",");
    		
    	}
    	System.out.println();
    	
    }
		
		
		
	}

}
