import java.util.ArrayList;

public class Company implements PayAble {
    private String name;
    ArrayList <PayAble> p1;

    public Company(String name) {
        p1 = new ArrayList<PayAble>();
        this.name = name;
    }
    public boolean addPayAble(PayAble payAble){
        return this.p1.add(payAble);
    }

    @Override
    public String toString() {
        String employee = "";
        for(int i = 0; i < p1.size();i++){

            if(p1.get(i) instanceof PartTimeEmployee){
                PartTimeEmployee e1 = (PartTimeEmployee)p1.get(i);
                 employee +=e1.toString()+" ";
            }else if(p1.get(i) instanceof FullTimeEmployee){
                FullTimeEmployee e2 = (FullTimeEmployee)p1.get(i);
                employee += e2.toString()+" ";
            }
            employee += " "+name;
        }
        return employee;
    }



    @Override
    public double ComputeAmount() {
        double total = 0;

        for(int i = 0; i < p1.size();i++){
            if(p1.get(i) instanceof PartTimeEmployee){
                PartTimeEmployee e1 = (PartTimeEmployee)p1.get(i);
                total += e1.ComputeAmount();
            }else if(p1.get(i) instanceof FullTimeEmployee){
                FullTimeEmployee e2 = (FullTimeEmployee)p1.get(i);
                total += e2.ComputeAmount();
            }
        }
        return total;
    }
}
