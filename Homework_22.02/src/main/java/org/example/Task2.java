package org.example;
//        2)* Тот же склад, что и в случае п.1 но у Вас есть две двери - одна в начале склада, вторая в конце.
//
//        Как бы вы построили оптимальный рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//
//        Напишите программу, которая бы имитировала работу.

import java.util.ArrayDeque;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<String> warehouse = new ArrayDeque<>();
        loadBricks(warehouse, "bricks", 10);
        shipBricks(warehouse, 5);
    }
    public static void loadBricks(Queue<String> warehouse, String product, int count) {
        for (int i = 1; i <= count; i++) {
            warehouse.offer(product + " " + i);
            System.out.println("load " + product + " " + i);
        }
    }
    public static void shipBricks(Queue<String> warehouse, int count) {
        System.out.println();
        System.out.println("Shipment of bricks: ");
        for (int i = 0; i < count; i++) {
            String product = warehouse.poll();
            if (product != null) {
                System.out.println("sold " + product);
            } else {
                System.out.println("sold out");
                break;
            }
        }
    }
}
