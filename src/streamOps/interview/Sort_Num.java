package streamOps.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Num {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,1, 2, 3, 4, 5);

        //Ascending order
        List<Integer> list = num.stream()
                .sorted()
                .toList();

        System.out.println(list);

        //Descending order
        num.stream()
                .sorted(Comparator.reverseOrder())
                .toList().forEach(i -> System.out.print(i + ", "));
    }
}
