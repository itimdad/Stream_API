package streamOps.slicing;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        //there are three methods for slicing operations
        //1 distinct()
        //2 limit()
        //3 skip()

        List<String> course = Arrays.asList("core java", "advance java", "spring boot", "rest api", "AOP");

        course.stream()
                .skip(2)
                .forEach(i -> System.out.println(i));

        System.out.println("===============================");
        course.stream()
                .limit(2)
                .forEach(i -> System.out.println(i));

        List<String> names =
                Arrays.asList("Raju", "Raju", "Rani", "Rani", "Karan", "Kishmis");

        System.out.println("===================================");
        names.stream()
                .distinct()
                .forEach(i -> System.out.println(i));
    }
}
