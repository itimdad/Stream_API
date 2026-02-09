package streamOps.interview;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.averagingInt;

public class DemoQ1 {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));


        //1) How many male and female employees are there in the organization ?
        Map<String, Long> count =
                employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(count);

        //2) Print the name of all departments in the organization ?
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(e -> System.out.print(e + ", "));

        System.out.println();

        //3) What is the average age of male and female employees ?
        Map<String, Double> averageAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, averagingDouble(Employee::getAge)));
        System.out.println( "Average age is : "+ averageAge);

        //4) Get the details of highest paid employee in the organization ?

        Optional<Employee> collect = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        if(collect.isPresent()) {
            System.out.println("Highest Paid Employee: " + collect.get());
        }

        //5. Get the names of all employees who have joined after 2015 ?
        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(name -> System.out.print(name + ", "));
        System.out.println();

        //6. Count the number of employees in each department ?
        Map<String, Long> empInDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println( empInDepartment);

        //7. What is the average salary of each department ?
        Map<String, Double> depAvgSal = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, averagingDouble(Employee::getSalary)));

        System.out.println(depAvgSal);

        //8. Get the details of youngest male employee in the Development department ?
        Optional<Employee> younEmp = employeeList.stream()
                .filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
                .min(Comparator.comparing(Employee::getAge));

        if(younEmp.isPresent()) {
            System.out.println( "Youngest Employee in Development dep :" + younEmp.get());
        }

        //9. Who has the most working experience in the organization ?
        Optional<Employee> mostExp = employeeList.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));

        if (mostExp.isPresent()) {
            System.out.println(mostExp.get());
        }

        //10. How many male and female employees are there in the Sales team ?
        Map<String, Long> sales = employeeList.stream()
                .filter(e -> e.getDepartment().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(sales);

        //11.  What is the average salary of male and female employees ?
        Map<String, Double> avgByGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, averagingDouble(Employee::getSalary)));

        System.out.println("Average salary " + avgByGender);

        //12. List down the names of all employees in each department ?
        Map<String, List<String>> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

        map.forEach((department, names) -> {
            System.out.println(department + "=> " + names);
        });

        //What is the average salary and total salary of the whole organization ?

        Double avg = employeeList.stream()
                .collect(averagingDouble(Employee::getSalary));

        Double totalSalary = employeeList.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Average salary of organization => " + avg);
        System.out.println("Total salary of whole org => " + totalSalary);

        // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?

    }
}
