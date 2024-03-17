package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Задание 1: Фильтрация списка целых чисел на нечетные числа

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        List<Integer> collect = num.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
