package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yevgen on 17.02.17.
 */
public class CompareStreamAndCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int totalValueCollectors = numbers.stream().collect(
                Collectors.summingInt((p) -> p));

        int totalValue1 = numbers.stream().collect(Collectors.reducing(
                0, Integer::valueOf, Integer::sum));

        int totalValue2 = numbers.stream().collect(Collectors.reducing(
                0, (p)->p, (p1,p2)->p1+p2));

        int totalValueStream = numbers.stream().mapToInt((n) -> n).sum();

        System.out.println(totalValueCollectors);
        System.out.println(totalValue1);
        System.out.println(totalValue2);
        System.out.println(totalValueStream);
    }
}
