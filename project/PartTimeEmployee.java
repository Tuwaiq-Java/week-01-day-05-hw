package com.project;

public class PartTimeEmployee extends Employee{
   private int workHour;
   private int wege;
    public PartTimeEmployee( int id,String name, int workHour,int wege ) {
        super(name, id);
        this.workHour=workHour;
        this.wege=wege;
    }

    public double computeAmount(){
        return workHour*wege;
    }

}
