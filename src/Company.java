import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<PayAble>payable=new ArrayList<>();



    public Company(String name) {
        this.name = name;

    }


   public boolean add(PayAble p){

        return payable.add(p);
   }
    public double computeAmount(){
        double total=0;
        for(int i =0 ; i< payable.size();i++){
         if(payable.get(i) instanceof FullTimeEmployee) {

             total+=payable.get(i).ComputeAmount();
         } else if (payable.get(i) instanceof PartTimeEmployee) {
             total+=payable.get(i).ComputeAmount();
         }

        }

       return total;
    }

    @Override
    public String toString() {
        return "Company{" +
                "payables=" +  payable.toString()+", name= "+name+
                '}';
    }
}