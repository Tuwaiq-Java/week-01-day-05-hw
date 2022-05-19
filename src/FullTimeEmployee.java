public class FullTimeEmployee extends Employee{
    private int weeklySalary;

    public FullTimeEmployee(int id,String name,int weeklySalary){
       super(id,name);

        this.weeklySalary = weeklySalary;
    }

    private int weeklySalary(){
        return 4*weeklySalary;
    }

    @Override
    public double ComputeAmount() {
        return weeklySalary();
    }
}