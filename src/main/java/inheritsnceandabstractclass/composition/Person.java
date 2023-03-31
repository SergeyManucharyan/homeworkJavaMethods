package inheritsnceandabstractclass.composition;

public class Person {
    private String name;
    private String city;
    private Job job;

    public Person(String name, String city, int id,String role,int salary) {
        this.name = name;
        this.city = city;
        this.job = new Job(id, role, salary);
    }

    @Override
    public String toString() {
        return "name= " + name +
                ", city= " + city +
                ", id= "+job.getId()+
                ", role " + job.getRole()+
                ", salary "+job.getSalary();
    }
}
