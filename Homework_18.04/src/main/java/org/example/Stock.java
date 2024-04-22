package org.example;
//        На склад приезжает машина, в которой загружено N ящиков (пользователь вводит с клавиатуры).
//        Автоматизированный разгрузчик вытягивает с машины ящик и кладет на рампу с определенным интервалом времени,
//        на которой может одновременно разместиться например 2 ящика.
//        В это время подъезжает автоматизированный погрузчик и везет его на место хранения. Он за раз может взять всего 1 ящик.
//        Каждый участник процесса представлен в виде отдельного потока Java.
//        Создайте программу, которая синхронизирует работу в данном процессе разгрузки автомобиля, с условием того, что Разгрузчик может быть только один,
//        а Погрузчиков может быть 2 и более (на ваше усмотрение).


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

// МОЖНО НЕ ПРОВЕРЯТЬ - НЕ ПОЛУЧИЛОСЬ =(

class Stock {
    private static int boxCount;
    //private static int rampBoxes;
    //private static boolean boxReady = false;
    private static AtomicInteger ramp = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько ящиков в машине? ");
        boxCount = sc.nextInt();


        Thread unloader = new Thread(() -> {
            synchronized (Stock.class){
            while (boxCount > 0) {
                boxCount = boxCount - 2;
                ramp.set(2);
                System.out.println("выгрузил ящики ");
                Stock.class.notifyAll();
            }
//            try {
//                //Stock.class.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            //Stock.class.notifyAll();
        }});


//        Thread car = new Thread(() ->{
//            for (int i = 0; i < boxCount; i++) {
//                synchronized (Stock.class){
//                    System.out.println("Разгружается ящик: ");
//                    boxReady = true;
//                    Stock.class.notifyAll();
//                    try {
//                        Stock.class.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }



        Thread loader1 = new Thread(() -> {
            while (true) {
                synchronized (Stock.class) {
                    try {
                        if (ramp.get() < 1) {
                            Stock.class.wait();
                        }
                        System.out.println("Погрузчик_1 забрал ящик ");
                        ramp.set(ramp.get() -1);
                        Stock.class.notify();
                        Thread.sleep(1000);
                        //Thread.sleep(2000);
                        //boxReady = false;
                        //Stock.class.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread loader2 = new Thread(() -> {
            while (true) {
                synchronized (Stock.class) {
                    try {
                        if (ramp.get() == 0) {
                            Stock.class.wait();
                        }
                        System.out.println("Погрузчик_2 забрал ящик ");
                        ramp.set(ramp.get() -1);
                        Stock.class.notify();
                        //boxReady = false;
                        //Stock.class.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

//        Thread loader2 = new Thread(() -> {
//            while (true) {
//                synchronized (Stock.class) {
//                    try {
//                        while (!boxReady) {
//                            Stock.class.wait();
//                        }
//                        System.out.println("Погрузчик 1 забрал ящик ");
//                        boxReady = false;
//                        Stock.class.notify();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
        unloader.start();
        loader1.start();
        loader2.start();
        loader1.join();
        loader2.join();
    }
}

