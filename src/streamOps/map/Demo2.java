package streamOps.map;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "Akash", "Charles");

        //Print name of length which start with "A"   using stream API

        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> name + " - "+ name.length())
                .forEach(i -> System.out.println(i));
    }
}
