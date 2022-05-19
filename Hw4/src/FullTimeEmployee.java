public class FullTimeEmployee extends Employee {
    private int weeklySalary;

    public FullTimeEmployee(int id,String name, int weeklySalary) {
        super(id,name );
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double ComputeAmount() {
        double amount=0;
        amount +=weeklySalary;
        return amount;
    }
}

