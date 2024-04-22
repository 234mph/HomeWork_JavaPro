package org.example;
//        У вас есть стол, на который один робоманипулятор кладет деталь, а второй забирает эту деталь.
//        Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет
//        эту деталь и только тогда класть следующую. Постройте программу, которая автоматизирует эту работу.
//        Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Robots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество деталей для обработки: ");
        int countDitails = scanner.nextInt();

        AtomicBoolean isTaken = new AtomicBoolean(true);

        Thread robot1 = new Thread(() -> {
            for (int i = 0; i < countDitails; i++) {
                synchronized (isTaken) {
                    System.out.println("Робот1 положил деталь ");
                    isTaken.set(false);
                    isTaken.notify();
                    try {
                        isTaken.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread robot2 = new Thread(() -> {
            for (int i = 0; i < countDitails; i++) {
                synchronized (isTaken) {
                    System.out.println("Робот2 взял деталь ");
                    isTaken.set(true);
                    isTaken.notify();
                    try {
                        isTaken.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        robot1.start();
        robot2.start();
    }
}