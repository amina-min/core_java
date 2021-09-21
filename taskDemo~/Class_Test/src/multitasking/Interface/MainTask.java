package multitasking.Interface;

public class MainTask {

    public static void main(String[] args) {
        TaskOne ob1 = new TaskOne();
        TaskTwo ob2 = new TaskTwo();
        
        //start is a method of  Thread so wqe need to create an object of thread class
        Thread thread = new Thread(ob1);
        thread.start();
        Thread thread2 = new Thread(ob2);
        thread2.start();
    }
}
