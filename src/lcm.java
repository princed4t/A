
public class lcm {
	
	public static void main(String[] args) {
		int[]a= {16,24,36};
		int gcd=1;
		int lcm=24;
	   for(int i=0;i<a.length-1;i++) {
		    int n1=a[i];
		    int n2=a[i+1];
		    int p=n1;
		    int q=n2;
		    while(n1%lcm!=0) {
		    	int r=n1%n2;
		    	n1=lcm;
		    	lcm=r;
		    	
		    }
		    gcd=n2;
		    
		   
		lcm=p*q/gcd;   
		   
		   
	   }
	
	System.out.println(lcm);	
		
		
		
		
		
	}
	
	

}
