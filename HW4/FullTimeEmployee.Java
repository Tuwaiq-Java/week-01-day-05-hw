public class FullTimeEmployee extends Employee{

    private int weeklySalary;

    public FullTimeEmployee(int id, String name, int weeklySalary) {
        super(id, name);
        this.weeklySalary = weeklySalary;
    }

    public double computeAmount() {
        return 4*weeklySalary;
    }
}
