package W1D5Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Company extends Employee {

    private String name;
    private List<PayAble> payAbles;


    @Override
    public String toString() {
        return "Company{payables= " +
                "[Employee {" +
                "name='" + name + '\'' +
                ", payAbles=" + payAbles +
                '}';
    }

    public Company(String name) {

        this.name = name;
    }

    public boolean add(PayAble p) {
        if (p == null) {
            return false;
        } else {

            List<PayAble> list = new ArrayList<>();
            list.add(p);
            for (PayAble payAble : list)
                System.out.println(payAble);


            return true;

        }


    }

    @Override
    public double computeAmount() {
        if (computeAmount() == 0){
            System.out.println("Enter a salary");
        } else {

        }
        return this;
    }
}
