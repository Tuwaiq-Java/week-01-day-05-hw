import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee(1,"Saleh",100);
        FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee(2,"Ali",50);

        PartTimeEmployee partTimeEmployee1=new PartTimeEmployee(1,"Khalid",8,100);
        PartTimeEmployee partTimeEmployee2=new PartTimeEmployee(2,"Noura",5,3);

        Company company=new Company("Tuwaiq");

        company.addPayAble(fullTimeEmployee1);
        company.addPayAble(fullTimeEmployee2);

        company.addPayAble(partTimeEmployee1);
        company.addPayAble(partTimeEmployee2);

        System.out.println(company);
        System.out.println(company.computeAmount());


    }
}