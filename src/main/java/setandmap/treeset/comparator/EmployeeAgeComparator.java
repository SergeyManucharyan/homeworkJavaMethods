package setandmap.treeset.comparator;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.getAge() - b.getAge();
    }
}

