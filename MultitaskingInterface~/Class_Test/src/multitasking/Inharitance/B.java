package multitasking.Inharitance;

import java.util.logging.Level;
import java.util.logging.Logger;

public class B extends Thread {

    @Override//run is a metod of thread that can be override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                // sleep is a method that excute after 500 ml
                sleep(500);
                System.out.println("class B");
            } catch (InterruptedException ex) {
               System.out.println(ex);
            }

        }

    }
}
