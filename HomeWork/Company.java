package HomeWork;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<PayAble> list;

    public Company(String name) {
        this.name = name;
        this.list=new ArrayList<>();
    }

    public boolean add(PayAble p){
        list.add(p);
        return true;
    }

    public double computeAmount(){
        double totalSalary=0.0;
        for (int i = 0; i < list.size(); i++) {
            totalSalary+=this.list.get(i).computeAmount();
        }
        return totalSalary;
    }

    @Override
    public String toString() {
        return "Company{payables=" +
                 '\'' +
                 list.toString() +",name=ْ'" + name +
                '}';
    }
}
