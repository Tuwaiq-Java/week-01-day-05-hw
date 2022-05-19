import java.util.ArrayList;

public class Company {
    private String name;
    private  ArrayList<PayAble>payables;



    public Company(String name) {
        payables = new ArrayList<>();

        this.name = name;

    }


    public boolean add(PayAble p) {
        return this.payables.add(p);
    }

    public double computeAmount(){
        double total=0;

        for(int i =0 ; i < payables.size();i++){

            if(payables.get(i) instanceof FullTimeEmployee) {
                total +=payables.get(i).computeAmount();

            } else if (payables.get(i) instanceof PartTimeEmployee) {
                total += payables.get(i).computeAmount();
            }
        }
        return total;
    }


    @Override
    public String toString() {
        return "Company{" +
                "payables='" + payables + '\'' +
                ", name=" + name +
                '}';
    }
}
