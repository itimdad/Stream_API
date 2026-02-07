package streamOps.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Min_Num {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,1, 2, 3, 4, 5);

        Optional<Integer> min = num.stream()
                .collect(Collectors.minBy(Comparator.comparing(n -> n)));

        System.out.println("MIN VALUE => " + min.get());

    }
}
