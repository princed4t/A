
public class Contentofanarrayreverse {

	public static void main(String[] args) {
		int[]a= {10,20,30,3,2,4};
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
			}
		System.out.println(a[4]);
	  
		
		
		
	}

}
