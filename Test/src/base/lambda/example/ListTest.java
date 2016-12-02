package base.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {

        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        //Prior Java 8 :  
        System.out.println("----Prior Java 8----");
        for (String feature : features) {
            System.out.println(feature);
        }
        //In Java 8:  
        System.out.println("----In Java 8----");
        features.forEach(n -> System.out.println(n));

        //In Java 8 method reference:  
        System.out.println("----In Java 8 method reference----");
        features.forEach(System.out::println);

        List<String> filtered = features.stream().filter(x -> x.length() > 10).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", features, filtered);

    }

}
