package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//Задание 2: Преобразование списка строк в список чисел


public class Task2 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("10","20","1", "10", "15", "50", "25");
        List<Integer> collect = strList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collect);


    }

}
