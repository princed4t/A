import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Occurrenceofeachnumber {

	private static Stream<int[]> of;

	public static void main(String[] args) {
		String str="iiitttre234";
	/*	int count=0;
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		 if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
			 count++;
		 }
			
			}
		System.out.println(count);
			
		}*/
		
		
		/*
		 * List<Character> collect =
		 * str.chars().mapToObj(i->(char)i).collect(Collectors.toList()); Map<Character,
		 * Long> collect2 =
		 * collect.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		 * 
		 * System.out.println(collect2);
		 * 
		 * IntStream chars = str.chars(); chars.forEach(i->System.out.println((char)i));
		 * 
		 * 
		 * List<Character> collect3 =
		 * str.chars().mapToObj(i->(char)i).collect(Collectors.toList()); Map<Character,
		 * Long> collect4 =
		 * collect3.stream().map(i->i).collect(Collectors.groupingBy(i->i,Collectors.
		 * counting()));
		 * 
		 * System.out.println(collect4);
		 */

	long collect= str.chars().mapToObj(i->(char)i).filter(i->i>='0'&&i<='9').count();
	System.out.println(collect);

}}
