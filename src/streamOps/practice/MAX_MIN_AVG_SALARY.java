package streamOps.practice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MAX_MIN_AVG_SALARY {

    public static void main(String[] args) {

        Employee e1 = new Employee("Karan", 25, 50000);
        Employee e2 = new Employee("Kashis", 35, 85000);
        Employee e3 = new Employee("Mishra", 27, 30000);
        Employee e4 = new Employee("Karan", 25, 70000);
        Employee e5 = new Employee("Karan", 25, 40000);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

        //Max Salary
        Optional<Employee> maxSalary = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));

        if(maxSalary.isPresent()) {
            System.out.println("Max Salary => " + maxSalary.get().salary);
        }

        //MIN salary
        Optional<Employee> minSalary =
                employees.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));

        System.out.println( "MIN salary => " + minSalary.get());

        //AVG salary
        Double avgSalary =
                employees.stream().collect(Collectors.averagingDouble(e -> e.salary));

        System.out.println("Avg salary => " + avgSalary);
    }
}
