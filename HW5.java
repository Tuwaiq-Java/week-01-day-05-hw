import java.util.ArrayList;

public class HW4 {
    public static void main(String[] args) {
        Company company = new Company();


        //creating a part time employee with 2 working hours and 4 wage
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee();
        partTimeEmployee1.setWage(4);
        partTimeEmployee1.setWorkHours(2);

        //print part1
       // System.out.println(partTimeEmployee1.computeAmount());

        //full time with 3 salary
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee();
        fullTimeEmployee1.setWeeklySalary(3);

        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee();
        fullTimeEmployee2.setWeeklySalary(3);


        company.addPayable(fullTimeEmployee1);
        company.addPayable(fullTimeEmployee2);
        company.addPayable(partTimeEmployee1);

        System.out.println(company.toString());


        //print full1
       // System.out.println(fullTimeEmployee1.computeAmount());
        
    }
}

interface PayAble{
    public double computeAmount();
}

abstract class Employee implements PayAble{
   private String name;
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class FullTimeEmployee extends Employee{
    private int weeklySalary;

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double computeAmount() {
        return weeklySalary * 4;
    }
}

class PartTimeEmployee extends Employee{
    private int workHours;
    private int wage;

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public double computeAmount() {
        return workHours * wage;
    }
}


class Company{
    private String name;
    private ArrayList<PayAble> list= new ArrayList<PayAble>();


    public boolean addPayable(PayAble payAble){

        return list.add(payAble);
    }

    public double totalEmployeeSalaries(){
        double sum =0;
        for (PayAble x: list) {
            x.computeAmount();
            if (x instanceof FullTimeEmployee){
                FullTimeEmployee temp = (FullTimeEmployee) x;
                sum += temp.computeAmount();
            }else {
                PartTimeEmployee temp = (PartTimeEmployee) x;
                sum += temp.computeAmount();
            }
        }
        return sum;
    }

    public double computeAmount(){
        return 0;
    }
    @Override
    public String toString() {
        return  "totalEmployeeSalaries='" + totalEmployeeSalaries();
    }

}
