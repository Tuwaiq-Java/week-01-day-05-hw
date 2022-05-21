public class FullTimeEmployee extends Employee{
    private int weeklySalary;

    public FullTimeEmployee(String id, String name, int weeklySalary) {
        super(id, name);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double computeAmount() {
        return 4*weeklySalary;
    }
}