
public class Maxsubarraybykandensalgoarithm {

	public static void main(String[] args) {
		int[]a= {-2,-3,4,-1,-2,1,5,-3};
	        int sum=0;
	        int maxsum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			/*
			 * if(sum>maxsum) { maxsum=sum;
			 * 
			 * }
			 */
		if(sum>maxsum) {
			maxsum=sum;
		}
			
			if(sum<0) {
				sum=0;
			}
			
			
			
			
		}
		System.out.println(maxsum);
		

	}

}
