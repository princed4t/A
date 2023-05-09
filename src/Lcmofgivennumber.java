

public class Lcmofgivennumber {

	public static void main(String[] args) {
		int[] a = { 12, 30, 45, 90 };
		int lcm = 1;
		int gcd = 1;

		for (int i = 0; i < a.length - 1; i++) {
			int p = a[i];
			int k = a[i + 1];
			int y = p;
			int z = k;
            if(i==0) {
			while (p % k != 0) {
				int r = p % k;
				p = k;
				k = r;

			}}
            if(i==1) {
    			while (lcm % k != 0) {
    				int r = p % k;
    				lcm = k;
    				k = r;

    			}}
            
            
            
			gcd = k;
			if (i == 0) {
				lcm = y * z;

				lcm = lcm / gcd;

			} else {

				lcm = lcm * z;

				lcm = lcm / gcd;
				p = lcm;

			}

		}

		System.out.println(lcm);
	}

}
