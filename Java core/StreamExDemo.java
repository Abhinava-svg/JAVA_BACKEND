// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.Optional;

public class StreamExDemo {
    public static void main(String[] args){

        List<String> names = Arrays.asList("Navin", "Laxmi", "john", "kishore");
        String name = names.stream()
                             .filter(str -> str.contains("x"))
                             .findFirst()
                             .orElse("Not Found");

        System.out.println(name);


    }
}
