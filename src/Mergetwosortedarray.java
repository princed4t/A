import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mergetwosortedarray {

	public static void main(String[] args) {
		int[]a= {5,4,3,1,2};
		int[]b= {9,6,5,2,7};
		List<Integer> a1 = Arrays.stream(a).mapToObj(i->i).collect(Collectors.toList());
		List<Integer> a2 = Arrays.stream(b).mapToObj(i->i).collect(Collectors.toList());
		List<List<Integer>> asList = Arrays.asList(a1,a2);
		 List<Integer> collect = asList.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		  List<Integer> collect2 = collect.stream().sorted((i,j)->(int)i-j).collect(Collectors.toList());
		//collect2.forEach(i->System.out.print(i+", "));
		int[]c=new int[collect2.size()];
		for(int i=0;i<c.length;i++) {
			c[i]=collect2.get(i);
		}
		
		System.out.println(c[1]);
		
		for(int v:c) {
			System.out.print(v);
		}
		
		
		
		
		
	}

}
