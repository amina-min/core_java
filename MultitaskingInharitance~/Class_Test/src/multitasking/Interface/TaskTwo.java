
package multasking.Interface;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

//runnable is an interface of thread 
public class TaskTwo implements Runnable{

    @Override
    public void run() {
       int i=0;
        while (i<=10) {
           try {
               sleep(1000);
               System.out.println("Programming is fun");
               i++;
           } catch (InterruptedException ex) {
               System.out.println(ex);
           }
        }
    }
    
}
