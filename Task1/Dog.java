package Task1;

public class Dog extends Pet{
    private String area;
    private String talk;

    public Dog(int age, double weight, String name, String area, String talk) {
        super(age, weight, name);
        this.area = area;
        this.talk = talk;
    }
}
