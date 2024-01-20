package Task3;

public class Manager extends Employee {
    int sold;

    public Manager(int age, String name, String sex, int sold) {
        super(age, name, sex);
        this.sold = sold;
    }


    public void Sold1(){
        System.out.println(this.name + " продал " + this.sold + " товара");
    }
}

