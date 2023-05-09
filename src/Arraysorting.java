import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arraysorting {
   //binary search
	public static int m1(int[]b,int searchelement) {
		int startpoint=0;
		int endpoint=b.length;
	
		int nofound=-1;
		while(startpoint<=endpoint) {
			int mid=(startpoint+endpoint)/2;
			if(searchelement==mid) {
				return mid;
			}
			else if(searchelement>b[mid]) {
				startpoint=mid+1;
			}
			else  {
				endpoint=mid-1;
			}

			
		}
		return nofound;
		
		
	}
	
	
	
	

	public static void main(String[] args) {
     //  System.out.println();
		
		int []a= {6,4,5,11,3,2,1};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println(m1(a,11));
		
			
		
}}
