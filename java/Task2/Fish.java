package Task2;

public class Fish extends Animal{
    boolean zhabri;       //наличие жабр

    public Fish(String name, int age, int weight, boolean zhabri) {
        super(name, age, weight);
        this.zhabri = zhabri;
    }
    public void SwimmingArea(){
        System.out.println(super.name + "  Плавает в воде");
    }
}
