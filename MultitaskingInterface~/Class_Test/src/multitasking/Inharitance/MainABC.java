package multitasking.Inharitance;

import multitasking.Inharitance.C;
import multitasking.Inharitance.B;
import multitasking.Inharitance.A;

public class MainABC {

    public static void main(String[] args) {
        
        //create object (class A class B class C)
        A obA = new A();
        B obB = new B();
        C obC = new C();
        
        //can not use run method
        obA.start();
        obB.start();
        obC.start();
 
    }
}
