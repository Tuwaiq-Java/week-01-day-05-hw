public class Main {
    public static void main(String[] args) {
        Company c = new Company();

        FulltimeEmployee fEmp = new FulltimeEmployee("123","Fahad", 5000);
        FulltimeEmployee fEmp2 = new FulltimeEmployee("321","Norah", 5000);
        FulltimeEmployee fEmp3= new FulltimeEmployee("333", "Malik", 5000);

        c.add(fEmp);
        c.add(fEmp2);
        c.add(fEmp3);

        PartTimeEmployee pEmp = new PartTimeEmployee("555", "Tariq", 20, 8);
        PartTimeEmployee pEmp2 = new PartTimeEmployee("567" , "Carl" , 12, 4);
        PartTimeEmployee pEmp3 = new PartTimeEmployee("007", "James" , 18, 6);

        c.add(pEmp);
        c.add(pEmp2);
        c.add(pEmp3);


        System.out.println(c.computeAmount());
        System.out.println(c.toString());
    }
}