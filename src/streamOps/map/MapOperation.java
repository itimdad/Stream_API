package streamOps.map;

import java.util.Arrays;
import java.util.List;

public class MapOperation {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("india", "uk", "china", "saudi");

//        countries.stream().map(country -> country.toUpperCase())
//                .forEach(i -> System.out.println(i));

        //length of each country
        countries.stream()
                .mapToInt(name -> name.length())
                .forEach(i -> System.out.println(i));

    }
}
