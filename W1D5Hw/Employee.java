package W1D5Hw;

public abstract class Employee implements PayAble{

private String name ;
private int id ;


    public Employee() {
    }



    public Employee(String name , int id){
        super();
         this.name = name;
         this.id = id;

}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
