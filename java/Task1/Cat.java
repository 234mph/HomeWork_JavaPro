package Task1;

public class Cat extends Pet{
 private String area;
 private String talk;

 public Cat(int age, double weight, String name, String area, String talk) {
  super(age, weight, name);
  this.area = area;
  this.talk = talk;
 }
 public void HounterMouse(){
  System.out.println(super.name + "  hountig");
 }
}
