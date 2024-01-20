package Task3;

public class Worker extends Employee {
    int countDetails;

    public Worker(int age, String name, String sex, int countDetails) {
        super(age, name, sex);
        this.countDetails = countDetails;
    }
    public void makeDetails(){
        System.out.println(this.name + " собрал " + countDetails + " деталей");
    }
}
