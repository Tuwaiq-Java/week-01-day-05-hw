import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<PayAble> payable = new ArrayList<PayAble>();
    private String name;

    public double computeAmount(){
        double amount = 0;
        for(PayAble p: payable){amount = amount + p.computeAmount();}
        return amount;
    }


    public boolean add(PayAble p){
        payable.add(p);
        return true;
    }

    @Override
    public String toString() {
        return "Company {" + "payables = " + payable + '}';
    }
}