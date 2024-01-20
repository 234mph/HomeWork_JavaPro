package Task2;

public class EarthAnimals extends Animal {
    boolean isHounter;

    public EarthAnimals(String name, int age, int weight, boolean isHounter) {
        super(name, age, weight);
        this.isHounter = isHounter;
    }
    public void FindEat(){
        if(isHounter){
            System.out.println(super.name + " is hounting");
        }
        else {
            System.out.println(super.name + " жует сено");
        }
    }
}
