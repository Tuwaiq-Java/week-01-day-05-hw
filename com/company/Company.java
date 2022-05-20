package com.company;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<PayAble> list = new ArrayList<PayAble>();

    public Company(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(ArrayList<PayAble> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public ArrayList<PayAble> getList() {
        return list;
    }

    public boolean add(PayAble p) {
        list.add(p);
        return true;
    }

    public double ComputeAmount(){
        double totalAmount = 0.0;
        for(int i = 0; i < list.size(); i++){
            totalAmount = totalAmount + list.get(i).ComputeAmount();
        }
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                " , payables=" + list +
                '}';
    }


}
