public class PartTimeEmployee extends Employee{
    private int workHours, hourWage;

    public PartTimeEmployee( int ID,String name, int workHours, int hourWage) {
        super(ID,name);
        this.workHours = workHours;
        this.hourWage = hourWage;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHourWage() {
        return hourWage;
    }


    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setHourWage(int hourWage) {
        this.hourWage = hourWage;
    }

    @Override
    public double computeAmount() {
        return workHours * hourWage;
    }

    public String toString() {
        return String.format("[name=%s, Salary=%.2f]", getName(),computeAmount());
    }
}
