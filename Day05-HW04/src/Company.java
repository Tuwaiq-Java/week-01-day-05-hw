import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<PayAble> payables = new ArrayList<PayAble>();
    private String name;

    public double computeAmount(){
       double amount = 0;
        for(PayAble p: payables){
            amount+= p.computeAmount();
        }
       return amount;
    }


    public boolean add(PayAble p){
        payables.add(p);
        return true;
    }

    @Override
    public String toString() {
        return "Company{" +
                "payables=\n" + payables +
                '}';
    }
}
