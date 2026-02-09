package streamOps.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Even_Num {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,1, 2, 3, 4, 5);

        Stream<Integer> even = num.stream()
                .filter(n -> n % 2 == 0);

        even.forEach(i -> System.out.println(i + " "));
    }
}
