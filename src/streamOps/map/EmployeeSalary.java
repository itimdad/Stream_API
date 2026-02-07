package streamOps.map;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {
    public static void main(String[] args) {

        Employee e1 = new Employee("Karan", 25, 50000);
        Employee e2 = new Employee("Kashis", 35, 85000);
        Employee e3 = new Employee("Mishra", 27, 30000);
        Employee e4 = new Employee("Karan", 25, 70000);
        Employee e5 = new Employee("Karan", 25, 40000);

        //get employee name and employee age whose salary is greater than 50k
        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

        //approach 1 using map
//        employees.stream()
//                .filter(e -> e.salary >= 50000)
//                .map(e -> "name: " + e.name + "  age: " + e.age)
//                .forEach(i -> System.out.println(i));

        //approach 2 without map
        employees.stream()
                .filter(e -> e.salary >= 50000)
                .forEach(e -> System.out.println("name => " + e.name + " age=> " + e.age));



    }
}

class Employee{
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
