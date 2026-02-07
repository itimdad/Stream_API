package streamOps.maching;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {

    public static void main(String[] args) {

        Person p1 = new Person("Jhon", "USA");
        Person p2 = new Person("Steve", "RUSSIA");
        Person p3 = new Person("Charles", "JAPAN");
        Person p4 = new Person("Vinay", "INDIA");
        Person p5 = new Person("Mike", "USA");
        Person p6 = new Person("Kishore", "INDIA");

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        boolean status1 = persons.stream().anyMatch(p -> p.country.equals("INDIA"));
        System.out.println("Is india available => " + status1);

        boolean status2 = persons.stream()
                .allMatch(e -> e.country.equals("USA"));

        System.out.println("Is all USA :=> " + status2);

        boolean status3 = persons.stream()
                .noneMatch(e -> e.country.equals("CANADA"));

        System.out.println("Canada is none of then => " + status3);
        
        
        //find any indian from list

        Optional<Person> findAny = persons.stream()
                .filter(e -> e.country.equals("INDIA"))
                .findAny();

        if(findAny.isPresent()) {
            System.out.println(findAny.get());
        }


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
