package Project;

public class FullTimeEmployee extends Employee{
    private int weekSalary;
    public FullTimeEmployee(int id, String name, int weekSalary) {
        super(id, name);
        this.weekSalary = weekSalary;
    }
    @Override
    public double computeAmount() {
        return weekSalary*4;
    }
}
