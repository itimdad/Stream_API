package streamOps.filter;

import java.util.Arrays;
import java.util.List;

public class PrintNameWIth_A {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Jhon", "Anushi", "Robert", "Anupma", "Smith", "Imdad");

        names.stream().filter(name -> name.startsWith("A")).forEach(i -> System.out.print(i + ", "));

    }
}
