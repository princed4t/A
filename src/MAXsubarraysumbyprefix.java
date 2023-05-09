
public class MAXsubarraysumbyprefix {

	public static void main(String[] args) {
		int[]a= {1,-2,6,-1,3};
		int sum=0;
		
		for(int i=0;i<a.length-1;i++) {
			sum=a[i]+a[i+1];
			a[i+1]=sum;
		
			
		}
		for(int i:a) {
			System.out.print(i+",");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
