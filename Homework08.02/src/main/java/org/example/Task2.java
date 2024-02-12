package org.example;
//        Перебрать ArrayList и найти наименьший элемент.
//        Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
//        Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
        arrayList.add(1);

        System.out.println(arrayList);
        System.out.println(minNum(arrayList));
        System.out.println("-----------------------------------");


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("one");
        arrayList2.add("two");
        arrayList2.add("three");
        arrayList2.add("four");
        arrayList2.add("five");
        arrayList2.add("six");
        arrayList2.add("seven");
        System.out.println(arrayList2);
        char letter = 'f';
        System.out.println(countElements(arrayList2, letter));
        System.out.println("-----------------------------------");

        deleteShortWords(arrayList2);
        System.out.println("Список слов после удаления:");
        for (String word : arrayList2) {
            System.out.println(word);
        }

    }

    public static int minNum(ArrayList<Integer> arrayList) {
        int minNum = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (minNum > arrayList.get(i)) {
                minNum = arrayList.get(i);
            }
        }
        return minNum;
    }

    public static int countElements(ArrayList<String> arrayList2, char letter) {
        int count = 0;
        for (String words : arrayList2) {
            if (words.charAt(0) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void deleteShortWords(ArrayList<String> arrayList2) { //не работает!!!! что делать?) все поперетыкал)
        for (int i = arrayList2.size() -1; i >= 0; i--) {
            if (arrayList2.get(i).length() < 3) {
                arrayList2.remove(i);

            }

            }
        }
    }

