package org.example;
//        Найти сумму всех элементов ArrayList.
//        Перебрать ArrayList и вывести все элементы на экран.
//        Создать ArrayList с объектами вашего собственного класса и вывести их на экран.

import java.util.ArrayList;
import java.util.List;

public class ArrayListTask {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех элементов ArrayList: " + sum);

        System.out.println("--------------------------------------");

        System.out.println("Элементы ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("--------------------------------------");
        class MyClass {
            private String name;

            public MyClass(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

        ArrayList<MyClass> arrayList2 = new ArrayList<>();
        MyClass obj1 = new MyClass("Tom");
        arrayList2.add(obj1);
        MyClass obj2 = new MyClass("Jerry");
        arrayList2.add(obj2);

        System.out.println("Объекты MyClass:");
        for (MyClass obj : arrayList2) {
            System.out.println(obj.getName());
        }
    }
}
