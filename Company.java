package Project;

import java.util.ArrayList;

public  class Company  {
    private String name ;
    private ArrayList<PayAble> list = new ArrayList<>();
    PayAble payAble ;

    public Company(String name) {
        this.name = name;
    }
    public boolean add (PayAble p){
        this.list.add(p);
        return true;
    }
    
    public double computeAmount(){
        double amount=0.0;
        for (int i = 0; i < list.size(); i++) {
            amount+=this.list.get(i).computeAmount();
        }
        return amount;
    }

    @Override
    public String toString() {
        return "Company{payables=" +
                '\'' +
                list.toString()+"name='" + name +
                '}';
    }

}
