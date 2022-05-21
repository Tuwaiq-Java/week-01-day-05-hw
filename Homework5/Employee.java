package Homework5;
import Homework5.PayAble;

public abstract class Employee implements PayAble {

    private int id;
    private String name;

    //constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
