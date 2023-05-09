
public class Subaraay {

	public static void main(String[] args) {
		int[] a = { 1,-2,6,-1,3};
		int sum = 0;
		int greattest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {

				for (int k = i; k <= j; k++) {
					System.out.print(a[k] + "  ");
					sum = sum + a[k];
				
				}
				if (sum > greattest) {
					greattest = sum;
				}
				System.out.println("-----sum is" + sum);
				sum = 0;

			}

		}
  System.out.println(greattest);
	}

}
