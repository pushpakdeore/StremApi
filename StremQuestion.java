package pushpak58java8;

import java.util.*;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department);
    }
}


public class StremQuestion {
    public static void main(String[] args) {
        //1 Given a list of integers, use the Stream API to find the sum of all even numbers.
        //Approach: Convert the list to a stream, filter even numbers, sum them using mapToInt
        //and sum().

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,98,7,6,5,4,3,2);
        Integer s =list.stream()
                .filter(n -> n%2 ==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum of even number :"+s);

        //2 Given a list of strings, use the Stream API to find the longest string.
        //Approach: Convert the list to a stream, use max() with a comparator by length.
        List<String> list1 =Arrays.asList("pushpak","kunal","ok");
        Optional<String> s1= list1.stream().max(Comparator.comparingInt(String::length));
        System.out.println(s1);

        //3Given a list of names, use the Stream API to count the number of names starting with
        //the letter "J".
        //Approach: Convert the list to a stream, filter names starting with "J", and use count().
        List<String> list3 =Arrays.asList("john","jill","psuhpak");
        Long count = list3.stream().filter(name -> name.startsWith("j")).count();
        System.out.println(count);

        //4 Use the Stream API to find the average of a list of double values.
        //Approach: Convert the list to a stream, use mapToDouble, and then average().
        List<Double> values = Arrays.asList(10.5, 20.0, 30.75, 40.25, 50.0);

        OptionalDouble d =values.stream().mapToDouble(Double::doubleValue).average();
        if(d.isPresent()){
            System.out.println("average of value :"+d.getAsDouble());

        }else {
            System.out.println("String empyt");
        }
        //5Given a list of employees, use the Stream API to group employees by their department.
        //Approach: Define an Employee class with department. Convert the list to a stream
        //and use collect(Collectors.groupingBy(Employee::getDepartment)).
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR"),
                new Employee("Alice", "Finance"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "IT"),
                new Employee("Diana", "Finance"),
                new Employee("Eve", "IT")
        );
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDepartment.forEach((department, empList) -> {
            System.out.println(department + ": " + empList);
        });

    }
}
