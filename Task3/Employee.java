//Вы работаете на предприятии, где работает большое количество сотрудников.
//        Создайте классы и схему наследования для организационной структуры предприятия:
//        Базовый класс - Employee с перечнем характеристик и поведением, которые присутствуют у любого сотрудника.
//        А далее все зависит от подразделений где они работают и их функциональных обязанностей.

        package Task3;

public class Employee {
    int age;
    String name;
    String sex;

    public Employee(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void WorksAt (){
        System.out.println(this.name + " Работает в отделе");
    }
}
