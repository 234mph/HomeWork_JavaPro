package Task1;

public class Pet {
    public int age;
    public double weight;
    public String name;

    public Pet(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }
    public void makeEat(String name){
        System.out.println(name + " кушает");
    }
    public void makeEat(){
        System.out.println(this.name + " eating");

    }
}

