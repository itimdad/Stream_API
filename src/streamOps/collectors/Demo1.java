package streamOps.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {

        Person p1 = new Person("Jhony", "USA");
        Person p2 = new Person("Steves", "RUSSIA");
        Person p3 = new Person("Charle", "JAPAN");
        Person p4 = new Person("Vijay", "INDIA");
        Person p5 = new Person("Mikes", "USA");
        Person p6 = new Person("Kishori", "INDIA");

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        List<Person> indians = persons.stream()
                .filter(p -> p.country.equals("INDIA"))
                .collect(Collectors.toList());

        indians.forEach(i -> System.out.println(i));

    }
}


class Person {
    String name;
    String country;

    Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
