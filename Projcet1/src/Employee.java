abstract public class Employee implements PayAble {
    private int id;
    private String name;



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    abstract public double ComputeAmount();
}
