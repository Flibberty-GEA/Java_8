package streams;

import java.util.stream.IntStream;

/**
 * Created by yevgen on 17.02.17.
 */
public class InfiniteSstreams {
    public static void main(String[] args) {
//        // Will run indefinitely
//        IntStream.iterate(0, i -> i + 1)
//                .forEach(System.out::println);

//        // That's better
//        IntStream.iterate(0, i -> i + 1)
//                .limit(10)
//                .forEach(System.out::println);


//        IntStream.iterate(0, i -> ( i + 1 ) % 2)
//                .distinct()
//                .limit(10)
//                .forEach(System.out::println);

//        IntStream.iterate(0, i -> ( i + 1 ) % 2)
//                .parallel()
//                .distinct()
//                .limit(10)
//                .forEach(System.out::println);

        IntStream.iterate(0, i -> ( i + 1 ) % 2)
                .limit(10)
                .distinct()
                .forEach(System.out::println);
    }
}
