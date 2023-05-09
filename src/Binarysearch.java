
public class Binarysearch {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int i=0;
		int e=a.length-1;
		int mid=a.length/2;
		int searchelement=2;
		int pos=0;
	//	System.out.println(pos);
		while(i<=e) {
		if(searchelement==a[mid]) {
			
			pos=mid;
			
			System.out.println (pos);
			break; 
		}
		else if (searchelement>a[mid]) {
			i=mid+1;
			
			
		}
		else {
			e=mid-1;
		}
		 mid=(i+e)/2;
		}
		
		if(pos==-1) {
			System.out.println("notfound");
		}
		else {
		System.out.println("element found at pos"+pos);	
		}
			
		
		

	}

}
