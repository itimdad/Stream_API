package streamOps.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicates {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,1, 2, 3, 3, 4, 5);

        List<Integer> unique = num.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

    }
}
