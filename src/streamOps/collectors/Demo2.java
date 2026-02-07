package streamOps.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {

        Person p1 = new Person("Jhony", "USA");
        Person p2 = new Person("Steves", "RUSSIA");
        Person p3 = new Person("Charle", "JAPAN");
        Person p4 = new Person("Vijay", "INDIA");
        Person p5 = new Person("Mikes", "USA");
        Person p6 = new Person("Kishori", "INDIA");

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        //find the name of the person who belongs to the india
        List<String> names = persons.stream()
                .filter(e -> e.country.equals("INDIA"))
                .map(e -> e.name)
                .collect(Collectors.toList());

        names.forEach(i -> System.out.println(i));

    }
}
