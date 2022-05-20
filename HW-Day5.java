
public interface PayAble {
    public double computeAmount();
}

public class Employee implements PayAble{
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id  +
                ", name=" +'\'' + name + '\''+
                '}';
    }
    @Override
    public double computeAmount() {
       return computeAmount();
    }

}

public class FullTimeEmployee extends Employee{
    private int weeklySalary;
    public FullTimeEmployee(int id,String name, int weeklySalary) {
        super(name, id);
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double computeAmount(){
        return  weeklySalary * 4;
    }

}

public class PartTimeEmployee extends Employee{
    private int workHours;
    private int Wage;
    public PartTimeEmployee(int id,String name, int workHours, int wage) {
        super(name, id);
        this.workHours = workHours;
        this.Wage = wage;
    }
    @Override
    public double computeAmount(){
        return workHours * Wage;
    }
}

import java.util.ArrayList;
public class Company {
    private String name;
    private ArrayList<PayAble> payables;
    public Company(String name) {
        this.name = name;
        payables = new ArrayList<>();
    }
    public void add(PayAble p) {
        payables.add(p);
    }
    public double computeAmount() {
        var amount = 0.0;
        for (int i = 0; i < payables.size(); i++) {
            amount += payables.get(i).computeAmount();
        }
        return amount;
    }
    @Override
    public String toString() {
        return "Company{" +
                "payables=" + payables +
                ", name=" + '\'' + name + '\'' +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee(1,"Saleh",100);
        FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee(2,"Ali",50);

        PartTimeEmployee partTimeEmployee1=new PartTimeEmployee(1,"Khalid",8,100);
        PartTimeEmployee partTimeEmployee2=new PartTimeEmployee(2,"Noura",5,3);

        Company company=new Company("Tuwaiq");

        company.add(fullTimeEmployee1);
        company.add(fullTimeEmployee2);

        company.add(partTimeEmployee1);
        company.add(partTimeEmployee2);

        System.out.println(company);
        System.out.println(company.computeAmount());

    }
}
