import java.util.ArrayList;

public class Company implements PayAble{
    private String name;
    private ArrayList<PayAble> list=new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }
    public boolean add(PayAble p){

        return this.list.add(p);
    }

    @Override
    public double ComputeAmount() {
        double amount=0.0;
        for (PayAble p1:list)
            amount+= p1.ComputeAmount();
        return amount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Payabels='" + list + '\'' +
                ", name=" + name +
                '}';
    }
}
