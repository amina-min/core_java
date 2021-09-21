
package multithreadingExample;

public class Task1 implements Runnable{
   
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("thread1 "+i);
        }
    }
}
