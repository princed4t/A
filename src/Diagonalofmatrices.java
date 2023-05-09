
public class Diagonalofmatrices {

	public static void main(String[] args) {
	int[][]a= {{10,20,30},
	{ 40,50,60},
	{70,80,90}
	
	};
	int col=a[0].length;
	
System.out.println(a.length);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i][i]+",");
	}
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i][col-1-i]+",");
	}
	
	
	}

}
