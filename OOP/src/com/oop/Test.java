
package com.oop;

public class Test {

    public static void main(String[] args) {

        Students student1 = new Students();
        student1.stName = "Sujon";
        student1.gender = "Male";
        student1.Phone = "01747644524";

        System.out.println("Name: " + student1.stName);
        System.out.println("gender: " + student1.gender);
        System.out.println("Phone: " + student1.Phone);
        System.out.println("  ");

        Students student2 = new Students();
        student2.stName = "Amina";
        student2.gender = "Female";
        student2.Phone = "0023156452";

        System.out.println("Name: " + student2.stName);
        System.out.println("gender: " + student2.gender);
        System.out.println("Phone: " + student2.Phone);
        System.out.println("  ");

        Students student3 = new Students();
        student3.stName = "Nayeem";
        student3.gender = "Male";
        student3.Phone = "0.03216892";

        System.out.println("Name: " + student3.stName);
        System.out.println("gender: " + student3.gender);
        System.out.println("Phone: " + student3.Phone);
        
       
    }

}
