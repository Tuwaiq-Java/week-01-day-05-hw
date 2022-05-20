package com.company;

public class FullTimeEmployee extends Employee{

    private int weeklySalary;

    public FullTimeEmployee(String name, int id, int weeklySalary) {
        super(name, id);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double ComputeAmount() {
        return 4 * weeklySalary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + getId() + ", name='"
                + getName() + '\'' +
                '}';

    }
}
