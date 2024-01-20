package Task1;

public class Run {
    public static void main(String[] args) {
        Pet pet1 = new Pet(29, 4.7, "Vasya");
        pet1.makeEat();
        pet1.makeEat("Murzik");

        Cat cat2 = new Cat(3, 5.2, "Barsik", "house", "mewo");
        cat2.HounterMouse();
    }


}
