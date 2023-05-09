import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Occurrenceofnumber {

	public static void main(String[] args) {
	int[]a= {10,20,30,2,40,40,2,2};
	IntStream stream = Arrays.stream(a);
	Map<Integer, Long> collect = stream.mapToObj(i->i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
	System.out.println(collect);
	Set<Integer> keySet = collect.keySet();
	Optional<Integer> reduce = keySet.stream().reduce((i,j)->collect.get(i)>collect.get(j)?i:j);
	reduce.ifPresent(i->System.out.println(i));

}}
