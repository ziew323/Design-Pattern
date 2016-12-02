package base.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        //java.util.function.Predicate<T>
        System.out.println("----java.util.function.Predicate<T>----");
        Predicate<String> letterLong = (str) -> str.length() > 10;
        Predicate<String> startWith = (str) -> str.startsWith("S");
        filter(features, letterLong.or(startWith));
    }

    public static void filter(List<String> features, Predicate<String> condition) {
        //        for (String feature : features) {
        //            if (condition.test(feature)) {
        //                System.out.println(feature);
        //            }
        //        }

        //更好的方式
        features.stream().filter((feature) -> (condition.test(feature))).forEach((feature) -> {
            System.out.println(feature);
        });
    }
}
