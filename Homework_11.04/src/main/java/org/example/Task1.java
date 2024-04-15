package org.example;
//     1. Запустите в 3 потока просчет суммы всех чисел, который без остатка делятся на 17  в интервале от 0 до 10 млн.
//        Показывайте на экран, как будет накапливаться сумма по каждому потоку.
//        После запуска просчета, главный поток остановите на 1 секунду и завершите его.
//        Все дочерние потоки должны автоматически закрыться.

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new ThreadTask(1, 3333333);
        Thread thread2 = new ThreadTask(3333334, 6666666);
        Thread thread3 = new ThreadTask(6666667, 10000000);

        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();

//        thread1.join();
//        thread2.join();
//        thread3.join();

        Thread.sleep(1000);
        System.exit(0);
    }


}
class ThreadTask extends Thread {
    final private int start;
    final private int end;


    public ThreadTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run(){
        int sum = 0;
        for (int i = start; i < end; i++){
            if(i % 17 == 0){
                sum = i + sum;
                System.out.println(Thread.currentThread().getName() + " -> sum = " + sum);
            }
        }
    }
}