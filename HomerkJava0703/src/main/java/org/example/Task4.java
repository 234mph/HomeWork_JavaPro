package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Задание 4: Определение максимального значения в списке
public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int maxValue = numbers.stream()
                .max((Integer x, Integer y) -> x.compareTo(y))
                .get();
        System.out.println(maxValue);
    }
}
