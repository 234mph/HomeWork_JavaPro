package Task3;

public class Director extends Employee{
    String instructions;

    public Director(int age, String name, String sex, String instructions) {
        super(age, name, sex);
        this.instructions = instructions;
    }
    public void Instuct(){
        System.out.println(this.name + " раздал указания");
    }
}
