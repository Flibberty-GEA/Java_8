package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompareStreamAndLoop {

    public static void main(String[] args) {
        System.out.println("Hello World!\n");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        List<Integer> twoEvenSquaresOld = new ArrayList<>();
//        for (int i = 0; i <= 3; i++) {
//            if (numbers.get(i) % 2 == 0) {
//                twoEvenSquaresOld.add(numbers.get(i)*numbers.get(i));
//            }
//        }

        List<Integer> twoEvenSquaresOld = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            System.out.println("if " + numbers.get(i));
            if (numbers.get(i) % 2 == 0) {
                twoEvenSquaresOld.add(numbers.get(i)*numbers.get(i));
                System.out.println("* " + numbers.get(i));
            }
        }
        System.out.println("Result "+twoEvenSquaresOld+"\n");


//        List<Integer> filter = new ArrayList<>();
//        for (Integer n:numbers) {
//            if (n%2==0) filter.add(n);
//        }
//
//        List<Integer> map = new ArrayList<>();
//        for (Integer f:filter) {
//            map.add(f*f);
//        }
//        List<Integer> limit = map.subList(0, 2);
        List<Integer> filter = new ArrayList<>();
        for (Integer n:numbers) {
            System.out.println("filtering " + n);
            if (n%2==0) filter.add(n);
        }
        List<Integer> map = new ArrayList<>();
        for (Integer f:filter) {
            System.out.println("mapping " + f);
            map.add(f*f);
        }
        List<Integer> limit = map.subList(0, 2);
        System.out.println("Result "+limit+"\n");

//        List<Integer> twoEvenSquaresStream =
//                numbers.stream()
//                        .filter(n -> n % 2 == 0)
//                        .map(n -> n * n)
//                        .limit(2)
//                        .collect(Collectors.toList());

        List<Integer> twoEvenSquaresStream =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(2)
                        .collect(Collectors.toList());


        System.out.println("Result "+twoEvenSquaresStream+"\n");
    }
}
