package Homework5;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee(1,"Saleh",100);
        FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee(2,"Ali",50);
        //FullTimeEmployee fullTimeEmployee3=new FullTimeEmployee(3,"Sara",80);
        //FullTimeEmployee fullTimeEmployee4=new FullTimeEmployee(4,"Huda",90);

        PartTimeEmployee partTimeEmployee1=new PartTimeEmployee(1,"Khalid",8,100);
        PartTimeEmployee partTimeEmployee2=new PartTimeEmployee(2,"Noura",5,3);
        //PartTimeEmployee partTimeEmployee3=new PartTimeEmployee(3,"Ahmed",3,70);
        //PartTimeEmployee partTimeEmployee4=new PartTimeEmployee(4,"Omar",5,120);


        Company company=new Company("Tuwaiq");

        company.add(fullTimeEmployee1);
        company.add(fullTimeEmployee2);
        //company.add(fullTimeEmployee3);
        //company.add(fullTimeEmployee4);

        company.add(partTimeEmployee1);
        company.add(partTimeEmployee2);
        //company.add(partTimeEmployee3);
        //company.add(partTimeEmployee4);

        System.out.println(company);
        System.out.println(company.computeAmount());
    }
}