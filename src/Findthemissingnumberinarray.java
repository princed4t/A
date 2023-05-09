
public class Findthemissingnumberinarray {

	public static void main(String[] args) {
	int[]a= {1,2,3,4,6,7};
	int expected_length=a.length+1;
	int  originalsum=expected_length*(expected_length+1)/2;
	int sumofArray=0;
	for(int i=0;i<a.length;i++) {
		sumofArray=sumofArray+a[i];
	}
	int missingnumber=originalsum-sumofArray;
	System.out.println(missingnumber);
	
	
	
		
		
		
		

	}

}
