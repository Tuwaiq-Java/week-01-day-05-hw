public class PartTimeEmployee extends Employee{

    private int workHours;
    private int wage;

    public PartTimeEmployee(int id,String name,int workHours, int wage){
    super(name,id);
    this.workHours = workHours;
    this.wage = wage;
    }
    @Override
    public double ComputeAmount() {
        return wage * workHours;
    }

    @Override
    public String toString() {
        return "{Name: "+getName()+"ID: "+getId()+", Salary: "+ComputeAmount()+"}";

    }
}




