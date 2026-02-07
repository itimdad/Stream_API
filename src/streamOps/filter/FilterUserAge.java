package streamOps.filter;

import java.util.stream.Stream;

public class FilterUserAge {

    public static void main(String[] args) {

        User u1 = new User("Anushi", 15);
        User u2 = new User("Arav", 35);
        User u3 = new User("Abiraj", 55);
        User u4 = new User("Charles", 18);
        User u5 = new User("Veen", 10);

//        List<User> users = Arrays.asList(u1, u2, u3, u4, u5);
//        users.stream()
//        .filter(u -> u.age >= 18)
//        .forEach(u -> System.out.println(u));


        Stream<User> users = Stream.of(u1, u2, u3, u4, u5);
//        users.filter(u -> u.age >= 18).forEach(u -> System.out.println(u));

        //find user which starting name is A and age should be >= 18
//        users.filter(u -> u.age >= 18 && u.name.startsWith("A"))
//                .forEach(u -> System.out.println(u));

        users.filter(u -> u.age >= 19)
                .filter(u -> u.name.startsWith("A"))
                .forEach(u -> System.out.println(u));
    }
}


class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}