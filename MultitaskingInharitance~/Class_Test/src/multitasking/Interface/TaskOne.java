package multasking.Interface;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

//runnable is an interface of thread so we need to implement it
public class TaskOne implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            try {
                //sleep is a method of thread so we need to import thread class
                sleep(1000);
                System.out.println("hihihi");
                i++;
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

}
