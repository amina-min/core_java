package multithreadingExample;

import multithreadingExample.Task1;
import multithreadingExample.Task2;

public class TskMain {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Thread thread1 = new Thread(t1);
        thread1.start();
        Thread thread2 = new Thread(t2);
        thread2.start();
    }
}
