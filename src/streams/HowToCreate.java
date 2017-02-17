package streams;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * How to create Streams
 */
public class HowToCreate {

    public static void main(String[] args) throws IOException {

        /**
         * Creating a Stream from the collection
         */
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();

        /**
         * Creating a Stream from the values
         */
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");

        /**
         * Creating a Stream from the array
         */
        String[] array = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);

        /**
         * Create Stream from a file
         *
         * Each line in the file is a separate element in the streamers
         */
        Stream<String> streamFromFiles = Files.lines(Paths.get("src/resource/file.txt"));

        /**
         * Creating a Stream from the String
         */
        IntStream streamFromString = "124".chars();

        /**
         * Creating a Stream with Stream.builder
         */
        Stream.builder().add("a1").add("a2").add("a3").build();

        /**
         * Creation of parallel Stream
         */
        Stream<String> stream = collection.parallelStream();
//
//        /**
//         * Create endless Stream via Stream.iterate
//         *
//         * Stream.iterate(initial_condition, generating_expression)
//         */
//        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);
//
//        /**
//         * Create endless Stream via Stream.generate
//         *
//         * Stream.generate(generating_expression)
//         */
//        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");

        Stream[] arrayStreams = {streamFromCollection, streamFromValues, streamFromArrays, streamFromFiles, stream};

        List<Stream> testStreams = Arrays.asList(arrayStreams);
        testStreams.stream().forEach((e) -> e.forEach(p -> System.out.println(p)));
//        streamFromString.forEach(p -> System.out.println(p));
        streamFromString.forEach(p -> System.out.println(Character.getNumericValue(p)));
//        streamFromGenerate.forEach(p -> System.out.println(p));
    }
}
