
public class Selectionsort {

	public static void main(String[] args) {
	  int[]b= {90,60,50,5,8,3};
	  // in selection sort put the lightest element first by swapping per iteration per swapping
	  for(int i=0;i<b.length;i++) {
		  int smallest=i;
		  
		  
		  for(int j=i+1;j<b.length;j++) {
			  if(b[smallest]>b[j]) {
				  smallest=j;
			  }
			  int temp=b[i];
			  b[i]=b[smallest];
			  b[smallest]=temp;
			  
			  
		  }
		 
		  
		  
	  }
	  
	  
	  for(int ab:b) {
		  System.out.print(ab+",");
	  }
	  
		
		
		
		
	}

}
