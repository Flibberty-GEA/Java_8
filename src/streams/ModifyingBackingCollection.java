package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by yevgen on 17.02.17.
 */
public class ModifyingBackingCollection {
    public static void main(String[] args) {
        // Of course, we create this list using streams:
        List<Integer> list =
                IntStream.range(0, 10)
                        .boxed()
                        .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list + "\n");

//        list.stream()
//                .sorted()
//                .peek(list::remove)
//                .forEach(System.out::println);
//        System.out.println(list+"\n");


//        list.stream()
//                .sorted()
//                .parallel()
//                .peek(list::remove)
//                .forEach(System.out::println);
//        System.out.println(list+"\n");

                list.stream()
                .sorted()
                .parallel()
                .forEach(list::remove);
        System.out.println(list+"\n");

    }
}
