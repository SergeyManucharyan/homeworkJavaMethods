package setandmap.treeset.comparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>(new EmployeeAgeComparator());
        employees.add(new Employee("Arman",30));
        employees.add(new Employee("Gexam",52));
        employees.add(new Employee("Sergey",15));
        employees.add(new Employee("Karen",18));
        for (Employee e:employees) {
            System.out.println(e);
        }
        System.out.println("------------------");
        Set<Employee> employee = new TreeSet<>(new EmployeeNameComparator());
        employee.add(new Employee("Arman",30));
        employee.add(new Employee("Gexam",52));
        employee.add(new Employee("Sergey",15));
        employee.add(new Employee("Karen",18));
        for (Employee e:employee) {
            System.out.println(e);
        }
    }
}

