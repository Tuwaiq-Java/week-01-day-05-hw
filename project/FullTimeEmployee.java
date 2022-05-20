package com.project;

public class FullTimeEmployee extends Employee{
    private int weeklySalary;
    public FullTimeEmployee( int id ,String name, int weeklySalary) {
        super(name, id);
        this.weeklySalary=weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        try {
            if(weeklySalary>=0)
                this.weeklySalary = weeklySalary;

        }catch (IllegalArgumentException e){}
        System.out.println("Can not be less than 0 SA");
    }

    public double computeAmount(){
        return 4*weeklySalary;
    }


}
