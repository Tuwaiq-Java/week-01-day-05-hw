import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(1, "Salah",500) ;
        Employee emp2 = new PartTimeEmployee( 2,"Khalid", 60,22);
        Employee emp3 = new FullTimeEmployee( 3,"Omar", 655);
        Employee emp4 = new PartTimeEmployee( 4,"Faisal", 100,27);
        Company company = new Company();
        company.addPayAble(emp1);
        company.addPayAble(emp2);
        company.addPayAble(emp3);
        company.addPayAble(emp4);
        System.out.println("toString(): "+company);
        System.out.printf("computeAmount(): %.2f",company.computeAmount());


    }
}