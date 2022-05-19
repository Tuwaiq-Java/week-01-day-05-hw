public abstract class Employee implements PayAble{
    private String name;
    private int id;

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public double ComputeAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
