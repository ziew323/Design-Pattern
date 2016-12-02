package base.lambda.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * 
 * @author jiaziwei
 *
 */
public class StreamUtil {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API",
            "Date and Time API");
        features.stream().distinct().filter((str) -> str.length() > 10).map((str) -> str.length())
            .forEach(System.out::println);

        List<Integer> nums = Arrays.asList(12, 1, 646, 23, 2, 343, 212, 33, 9, 754, 32, 13, 79, 7, 4);
        System.out.println(nums.stream().reduce((sum, n) -> sum + n).get());
        IntSummaryStatistics stats = nums.stream().mapToInt((str) -> str).summaryStatistics();
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());
        UnaryOperator<Integer> countDigits = (x) -> {
            int d = 0;
            while (x > 0) {
                d++;
                x /= 10;
            }
            return d;
        };
        nums.stream().sorted((x, y) -> {
            int r = countDigits.apply(x) - countDigits.apply(y);
            return r == 0 ? y - x : r;
        }).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);
        list.stream().forEach(x -> x++);
        System.out.println(list);
    }

    public static <T> List<T> sorted(List<T> list, Comparator<T> lambda) {
        return list.stream().sorted(lambda).collect(Collectors.toList());
    }

    public static <T> IntSummaryStatistics summaryStatistics(List<T> list, ToIntFunction<T> lambda) {
        return list.stream().mapToInt(lambda).summaryStatistics();
    }

    /**
     * 操作
     * @param <T> 原始类型
     * @param <R> 返回类型
     * @param list 集合
     * @param lambda 操作表达式（带返回）
     * @return
     */
    public static <T, R> List<R> map(List<T> list, Function<T, R> lambda) {
        return list.stream().map(lambda).collect(Collectors.toList());
    }

    /**
     * 过滤
     * @param list 集合
     * @param lambda 断言表达式
     * @return
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> lambda) {
        return list.stream().filter(lambda).collect(Collectors.toList());
    }

    /**
     * 归纳
     * @param list 集合
     * @param lambda 运算表达式
     * @return
     */
    public static <T> Optional<T> reduce(List<T> list, BinaryOperator<T> lambda) {
        return list.stream().reduce(lambda);
    }

    /**
     * 去重
     * @param list 集合
     * @return
     */
    public static <T> List<T> distinct(List<T> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    /**
     * 遍历
     * @param list 集合
     * @param lambda 操作表达式
     */
    public static <T> void forEach(List<T> list, Consumer<T> lambda) {
        list.forEach(lambda);
    }

    /**
     * 打印
     * @param list 集合
     */
    public static <T> void print(List<T> list) {
        forEach(list, System.out::println);
        System.out.println();
    }

}
