import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<PayAble> list = new ArrayList<>();

    public Company (String name){
        this.name = name;

    }
    public boolean add (PayAble payAble){
        return this.list.add(payAble);
    }



    @Override
    public String toString() {
        String employee = "";
        for(int i = 0; i < list.size();i++){

            if(list.get(i) instanceof PartTimeEmployee){
                PartTimeEmployee e1 = (PartTimeEmployee)list.get(i);
                employee += e1.toString()+" ";
            }else if(list.get(i) instanceof FullTimeEmployee){
                FullTimeEmployee e2 = (FullTimeEmployee)list.get(i);
                employee += e2.toString()+" ";
            }
            employee += " " + name;
        }
        return employee;
    }

    public double ComputeAmount() {
        double total = 0;

        for(int i = 0; i < list.size();i++){
            if(list.get(i) instanceof PartTimeEmployee){
                PartTimeEmployee e1 = (PartTimeEmployee)list.get(i);
                total += e1.ComputeAmount();
            }else if(list.get(i) instanceof FullTimeEmployee){
                FullTimeEmployee e2 = (FullTimeEmployee)list.get(i);
                total += e2.ComputeAmount();
            }
        }
        return total;
    }
}
