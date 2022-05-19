public abstract class Employee implements PayAble {
    private String name;
    private int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract double computeAmount();
}
