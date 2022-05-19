import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        FullTimeEmployee e1 = new FullTimeEmployee("Abdulrahman",1,2300);
//        FullTimeEmployee e2 = new FullTimeEmployee("Abdulaziz",2,2800);
//        PartTimeEmployee e3 = new PartTimeEmployee("Ali",3,4,500);
//        PartTimeEmployee e4 = new PartTimeEmployee("Omar",4,4,700);
//
//
//        Company c1 = new Company();
//        c1.addPayAble(e1);
//        c1.addPayAble(e2);
//        c1.addPayAble(e3);
//        c1.addPayAble(e4);
//        System.out.println(c1.toString());
//        System.out.println(c1.ComputeAmount());
        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee("Saleh",1,100);
        FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee("Ali",2,50);
        PartTimeEmployee partTimeEmployee1=new PartTimeEmployee("Khalid",1,8,100);
        PartTimeEmployee partTimeEmployee2=new PartTimeEmployee("Noura",2,5,3);

        Company company=new Company("Tuwaiq");

        company.addPayAble(fullTimeEmployee1);
        company.addPayAble(fullTimeEmployee2);

        company.addPayAble(partTimeEmployee1);
        company.addPayAble(partTimeEmployee2);

        System.out.println(company);
        System.out.println(company.ComputeAmount());


    }
}