import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicatenumberinarary {

	public static void main(String[] args) {
		int[]a= {10,20,10,30,40};
	/*Map<Integer, Long> map = Arrays.stream(a).mapToObj(i->i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        //Optional<Integer> reduce = map.keySet.stream().map(i->i).reduce((i,j)->maySet().stream().map.get(i)>map.get(j)?i:j);  
		//reduce.ifPresent(i->System.out.print(i));
		Set<Integer> keySet = map.keySet();
		   for(int i:keySet) {
			   if(map.get(i)>1) {
				   System.out.print("key="+i+"value is----"+map.get(i));
				   System.out.println();
			   }*/
			 Set<Integer> collect = Arrays.stream(a).mapToObj(k->k).collect(Collectors.toSet());
			for(int t:collect) {
				if(!collect.contains(t)) {
					collect.add(t);
				}
				else {
					System.out.println(t);
					break;
					
				}
			}
			   
			   
			   
			   
		   }
			   
		
		
		
	}


