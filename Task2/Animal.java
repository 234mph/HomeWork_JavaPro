//Создать классы и схему наследования для задачи учета животных в зоопарке:
//
//
//        Как минимум должен быть общий класс Animal с характеристиками и поведением, характерными для всех животных.
//        А дальше уже Ваше творчество, в котором вы должны разбить животных на группы и подгруппы.

        package Task2;

public class Animal {
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void EatingSmth(){
        System.out.println(this.name + "eating");
    }
}
