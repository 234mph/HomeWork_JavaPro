package org.example;
//        Создайте 2 потока (1 - Курица, 2 - Яйцо).
//        Первый будет постоянно выводить слово "Курица" и останавливаться на 1 сек.
//        Второй будет постоянно выводить слово "Яйцо" и тоже останавливаться на 1 сек.
//        Главный поток выводит на экран сообщение "Кто же первый? " и запускает оба дочерних потока.
//        Потом главный поток спрашивает у пользователя: "Кто же прав?"
//        Если пользователь вводит 1, главный поток выключает поток, который выводит "Яйцо".
//        Если вводит 2, главный поток выключает дочерний поток, который выводит "Курица".
//        Иначе выключает оба потока и возвращает фразу "Как же вы надоели!".

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Thread chicken = new Chicken();
        Thread egg = new Egg();
        System.out.println("Who is first?");
        chicken.start();
        egg.start();
        System.out.println("who is right?");
        Scanner userInput = new Scanner(System.in);
        int userInputValue = userInput.nextInt();
            if (userInputValue == 1) {
                egg.interrupt();
            } else if (userInputValue == 2) {
                chicken.interrupt();
            } else {
                egg.interrupt();
                chicken.interrupt();
                System.out.println("what is your problem? ");
            }
    }
}

class Egg extends Thread {
    public void run() {
        try {
            while (!Thread.interrupted()){
                System.out.println("Egg");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Chicken extends Thread {
    public void run() {
        while (!Thread.interrupted()) {
            try {
                System.out.println("Chicken");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}