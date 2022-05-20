import java.util.ArrayList;
import java.util.List;

public class Company implements PayAble {

    private String name;
    ArrayList<PayAble> object;

    public Company(String name) {
        this.name = name;
        object = new ArrayList<>();
    }

    public boolean addPayAble(PayAble payAbles){

        return this.object.add(payAbles);
    }

    @Override
    public double computeAmount() {
        double sum = 0;

        for (int i=0; i<object.size();i++){

            if (object.get(i) instanceof FullTimeEmployee){
                FullTimeEmployee employeeFull =(FullTimeEmployee)object.get(i);
                sum += employeeFull.computeAmount();
            }else if(object.get(i) instanceof PartTimeEmployee){
                PartTimeEmployee employeePart = (PartTimeEmployee)object.get(i);
                sum += employeePart.computeAmount();
            }


           // System.out.println("the sum computeAmount Fun for Company class" + sum);



        }
        return sum;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", object=" + object +
                '}';
    }
}
