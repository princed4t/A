
public class Printoddnumberusingrecursion {
	  public static void m1(int n) {
		  
		  if(n==1) {
			 System.out.print(n);
			 return;
			 
		  }
			if(n%2!=0) {
				System.out.print(n+",");
			}
			m1(n-1);
		  
		
		  
	  }
	 
	
	
	
	

	public static void main(String[] args) {
		System.out.println("hiii");
		m1(10);

	}

}
