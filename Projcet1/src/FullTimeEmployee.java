public class FullTimeEmployee extends Employee{
    private int weeklySalary;

    public FullTimeEmployee(String name, int id,int weeklySalary) {
        super(id,name);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "{Name: "+getName()+"ID: "+getId()+", Salary: "+ComputeAmount()+"}";
    }

    @Override
    public double ComputeAmount() {

        return 4*weeklySalary;
    }
}
