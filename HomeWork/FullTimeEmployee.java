package HomeWork;

public class FullTimeEmployee extends Employee{

    private int weeklySalary;

    public FullTimeEmployee( int id,String name, int weeklySalary) {
        super(id,name);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double computeAmount() {
        return this.weeklySalary*4;
    }
}
