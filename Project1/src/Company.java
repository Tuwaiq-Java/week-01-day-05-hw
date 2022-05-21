import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<PayAble> payAble;

    public Company(String name) {
        this.name = name;
        this.payAble = new ArrayList<>();

    }


    public boolean add(PayAble p) {
        payAble.add(p);
        return true;
    }


     public double computeAmount() {
        double total=0.0;
        List<PayAble>p=payAble;
         for (int i=0; i < p.toArray().length;i++){
             total =total+p.get(i).computeAmount();
         }
        return total;
     }


    @Override
    public String toString() {
        return "Company{" +
                "payAble=" + payAble +
                " , name='" + name + '\'' +
                '}';
    }
}
