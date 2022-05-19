public class PartTimeEmployee extends Employee{
    private int workHours;
    private int wage;

    public PartTimeEmployee(String name, int id,int workHours, int wage) {
        super(id,name);
        this.workHours = workHours;
        this.wage = wage;
    }

    @Override
    public double ComputeAmount() {
        return wage*workHours;
    }

    @Override
    public String toString() {
        return "{Name: "+getName()+"ID: "+getId()+", Salary: "+ComputeAmount()+"}";

    }
}
