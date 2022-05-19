public class FullTimeEmployee extends Employee{
    private int weekSalary;

    public FullTimeEmployee(int ID,String name,int weekSalary) {
        super(ID, name);
        this.weekSalary = weekSalary;
    }

    public int getWeekSalary() {
        return weekSalary;
    }


    @Override
    public double computeAmount() {
        return weekSalary * 4;
    }

    @Override
    public String toString() {
            return String.format("[name=%s, Salary=%.2f]", getName(),computeAmount());

    }
}
