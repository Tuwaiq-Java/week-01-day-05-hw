public class FullTimeEmployee extends Employee{

    private int weeklySalary;

    public FullTimeEmployee(int id, String name,int weeklySalary){
        super(name,id);
this.weeklySalary=weeklySalary;
    }

    @Override
    public String toString() {
        return "{Name: "+getName()+"ID: "+getId()+", Salary: "+ComputeAmount()+"}";
    }

    @Override
    public double ComputeAmount() {

        return 4 * weeklySalary;
    }
}
