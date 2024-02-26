package org.example;
//        1) Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
//        У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
//        Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//        Напишите программу, которая бы имитировала работу.


import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
            Stack<String> warehouse = new Stack<>();
            loadBricks(warehouse, "bricks", 10);
            shipBricks(warehouse, 15);

        }

        public static void loadBricks(Stack<String> warehouse, String bricks, int count) {
            for (int i = 1; i <= count; i++) {
                warehouse.push(bricks + " " + i);
                System.out.println("load " + bricks + " " + i);
            }
        }

        public static void shipBricks(Stack<String> warehouse, int count) {
            System.out.println();
            System.out.println("Shipment of bricks :");
            for (int i = 0; i < count; i++) {
                if (!warehouse.isEmpty()) {
                    String product = warehouse.pop();
                    System.out.println("sold " + product);
                } else {
                    System.out.println("Sold out");
                    break;
                }
            }
        }
    }