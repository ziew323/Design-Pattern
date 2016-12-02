package base.lambda.example;

import java.util.Arrays;
import java.util.List;

public class MapTest {
    public static void main(String[] args) {
        // Old way:
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            total = total + price;
        }
        System.out.println("Total : " + total);
        // New way:
        costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double bill = costBeforeTax.stream().map((cost) -> cost + .12 * cost)
            .reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);
    }
}
