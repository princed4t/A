import java.util.Arrays;

public class Valiidinputoroutputstring {

	public static void main(String[] args) {
		String str[] = { "()", "[]", "{}" };

		int count = 0;
		for (int i = 0; i < str.length; i++) {
			String string = str[i];
			char[] ch = string.toCharArray();
			for (int j = 0; j < ch.length;) {
				if (ch[j] == '(' && ch[j + 1] == ')') {

					count++;
					break;

				} else if (ch[j] == '[' && ch[j + 1] == ']') {

					count++;
					break;

				} else if (ch[j] == '{' && ch[j + 1] == '}') {

					count++;
					break;

				} else {
				
					break;

				}

			}

		}

		if (count == str.length) {
			System.out.println("it is true");
		} else {
			System.out.println("it is false");
		}

	}

}
