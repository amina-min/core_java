
package com.taskdemo;


public class TaskThreadDemo {
    public static void main(String[] args) {
        
        Runnable  ob1=new  PrintNum(100);
        Runnable ob2=new PrintChar('a', 100);
        Runnable ob3=new PrintChar('b', 100);
        
        Thread t1=new Thread(ob1); 
        Thread t2=new Thread(ob1);
        Thread t3=new Thread(ob3);
        t1.start();
        t2.start();
        t3.start();
    }
}
