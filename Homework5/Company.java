package Homework5;
import Homework5.PayAble;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<PayAble> payable;

    public Company(String name) {
        this.name = name;
        payable = new ArrayList<PayAble>();
    }

    public boolean add(PayAble p) {
        payable.add(p);
        return true;
    }

    public double computeAmount()  {
        double countTotal = 0.0;
        for(PayAble p:payable){
            countTotal = countTotal +p.computeAmount();
        }
        return countTotal;
    }

    @Override
    public String toString() {
        return "Company{" + ", payable=" + payable + "name='" + name + '\'' +'}';
    }
}
