package com.company;

public class PartTimeEmployee extends Employee{

    private int WorkHour;
    private int Wage;

    public PartTimeEmployee(String name, int id, int WorkHour, int Wage) {
        super(name, id);
        this.WorkHour = WorkHour;
        this.Wage = Wage;
    }

    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

    public void setWage(int wage) {
        Wage = wage;
    }

    public int getWorkHour() {
        return WorkHour;
    }

    public int getWage() {
        return Wage;
    }

    @Override
    public double ComputeAmount() {
        return WorkHour * Wage;
    }

    @Override
    public String toString() {
        return "Employee{id=" + getId() + ", name='"
                + getName() + '\'' +
                '}';
    }
}
