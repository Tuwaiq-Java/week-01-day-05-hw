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

                this.weeklySalary = weeklySalary;
    }


    public double computeAmount(){
        return 4*weeklySalary;
    }


}
