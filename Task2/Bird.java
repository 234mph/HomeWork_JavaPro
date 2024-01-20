package Task2;

public class Bird extends Animal{
    Boolean fly;    // летает или нет

    public Bird(String name, int age, int weight, Boolean fly) {
        super(name, age, weight);
        this.fly = fly;
    }
    public void TransportType(){
        if(fly){
            System.out.println(super.name + " Летает");
        }
        else {
            System.out.println(super.name + " ходит");
        }
    }
}
