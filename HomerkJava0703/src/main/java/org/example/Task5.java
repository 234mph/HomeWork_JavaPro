package org.example;

import java.util.Arrays;
import java.util.List;

//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
public class Task5 {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("one", "two", "three", "four", "five");
        List<String> words = wordList
                .stream().map(s -> {
                    if (s.startsWith("f")) {
                        return s.toUpperCase();
                    }
                    return s;
                }).toList();
        System.out.println(words);

    }
}



