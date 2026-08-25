import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// import java.util.function.Function;
// import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args){
        List<Integer>nums = Arrays.asList(4, 5, 6, 2, 3, 7);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // s3.forEach(n -> System.out.println(n));
        
        // int result = s3.reduce(0, (c,e) -> c+e);

        // Predicate <Integer> p =  n -> n%2==0;

        // Function<Integer, Integer> fun = n -> n*2;
                
        //         int result = nums.stream()
        //                  .filter(n -> n%2==0)
        //                  .map(n -> n*2)
        //                  .reduce(0, (c,e) -> c+e);
        

        // System.out.println(result);

        Stream<Integer> SortedValues = nums.stream()
                                            .filter(n -> n%2==0)
                                            .sorted();

        SortedValues.forEach(n -> System.out.println(n)); 


    }
}
