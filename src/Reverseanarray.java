import java.util.Collections;

public class Reverseanarray {
   public static void main(String[] args) {
	
      
	int[] myArray = {10,20,40,9,7};
	int length = myArray.length;

	for (int i = 0; i < length/2; i++) {
	    int temp = myArray[i];
	    myArray[i] = myArray[length-1-i];
	    myArray[length-1-i] = temp;
	}
	
	System.out.println(myArray[2]);
     
	for(int i:myArray) {
System.out.print(i+",");	
	
	
	
	}
   
	
		
		
	// System.out.println(a[3]);
	

	}
}

