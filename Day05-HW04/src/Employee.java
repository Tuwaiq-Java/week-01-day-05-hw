public abstract class Employee implements PayAble {
private String id, name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id  +
                ", name='" + name +
                '}'+"\n";
    }
}
