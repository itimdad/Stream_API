package streamOps.filter;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<Integer> nums =
                Arrays.asList(20, 30, 40, 50, 60, 70, 80, 1, 5, 6);

//      Stream<Integer> stream = nums.stream();
//      Stream<Integer> integerStream = stream.filter(num -> num > 20);
//      integerStream.forEach(i -> System.out.println(i));

        nums.stream().filter(i -> i > 20).forEach(i -> System.out.print(i + " "));


    }
}
