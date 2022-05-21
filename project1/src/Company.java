import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private List<PayAble> payables= new ArrayList<PayAble>();


    public Company(String name) {
        this.name = name;
    }
    public boolean add(PayAble p){
        payables.add(p);
        return true;
    }
    public double computeAmount(){
        double amount=0;
        for(PayAble p: payables){
            amount +=p.computeAmount();
        }
        return amount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", payables=" + payables +
                '}';
    }
}

