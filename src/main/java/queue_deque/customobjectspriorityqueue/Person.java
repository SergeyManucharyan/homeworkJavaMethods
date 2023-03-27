package queue_deque.customobjectspriorityqueue;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+" "+age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
