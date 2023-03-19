package inheritsnceandabstractclass.composition;

public class Job {
    private int id;
    private String role;
    private int salary;

    public int getId() {
        return id;
    }

    public Job(int id, String role, int salary) {
        this.id = id;
        this.role = role;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
