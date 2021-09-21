package re_javaproject.newpackage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //students 
        System.out.println("===Simple School Money Management System==");
        System.out.println(" * STUDENTS INFORMATION * ");
        
        Student st1 = new Student(101, "Jakiya", "A");
        Student st2 = new Student(102, "Arib", "A+");
        Student st3 = new Student(103, "Raiyan", "B");
        Student st4 = new Student(104, "Tasfiya", "A-");
        Student st5 = new Student(105, "Soha", "B+");

        List<Student> st_List = new ArrayList<>();
        st_List.add(st1);
        st_List.add(st2);
        st_List.add(st3);
        st_List.add(st4);
        st_List.add(st5);
        
        for(int i=0; i<st_List.size();i++){
        System.out.println(st_List.get(i).getSt_name());
        }
        
        System.out.println(" ");
        System.out.printf("%-15s%-15s%-15s\n","NAME","ID","GRADE");
        for (Student student : st_List) {            
            System.out.printf("%-15s%-15d%-15s\n",student.getSt_name(),student.getSt_id(), student.getGrade() );
            
        }
        
        
       
        

        st1.setPaidFees(10000);
        st2.setPaidFees(7000);
        st2.setPaidFees(3000);
        st3.setPaidFees(5000);
        st3.setPaidFees(5000);
        st4.setPaidFees(10000);
        st5.setPaidFees(10000);
        
        
        System.out.println(" ");
        System.out.println("=====student's paid=====");
        
        System.out.print(st1.getSt_name());
        System.out.print(" ");
        System.out.println(st1.getTotalFees());

        System.out.print(st2.getSt_name());
        System.out.print(" ");
        System.out.println(st1.getTotalFees());

        System.out.print(st3.getSt_name());
        System.out.print(" ");
        System.out.println(st3.getTotalFees());

        System.out.print(st4.getSt_name());
        System.out.print(" ");
        System.out.println(st5.getTotalFees());

        System.out.print(st5.getSt_name());
        System.out.print(" ");
        System.out.println(st5.getTotalFees());

        //Teacher's        
        Teacher t1 = new Teacher(100, "Abdullah", 15000);
        Teacher t2 = new Teacher(200, "Jakir Alom", 10000);
        Teacher t3 = new Teacher(300, "Sofiullah", 10000);
        Teacher t4 = new Teacher(400, "Jabbar", 10000);
        Teacher t5 = new Teacher(500, "Kudrot", 10000);

        List<Teacher> t_List = new ArrayList<>();
        t_List.add(t1);
        t_List.add(t2);
        t_List.add(t3);
        t_List.add(t4);
        t_List.add(t5);

        t1.setT_salary(15000);
        t2.setT_salary(10000);
        t3.setT_salary(10000);
        t4.setT_salary(10000);
        t5.setT_salary(10000);
        System.out.println("  ");
        
        System.out.println("* TEACHER'S INFORMATION *");
        System.out.println("=====Teacher's salary paid======");
        System.out.println("Abdullah get " + t1.getT_salary());
        System.out.println("Jakir Alom get " + t2.getT_salary());
        System.out.println("Sofiullah get " + t3.getT_salary());
        System.out.println("Jabbar get " + t4.getT_salary());
        System.out.println("Kudrot get " + t5.getT_salary());
        
        System.out.println("  ");
        
        System.out.println("* SCHOOL INFORMATION *");
        System.out.println("* ====School Earned Spend and Profit==== *");
        System.out.println("School Earned " + School.totalMoneyEarned);
        System.out.println("School Spend " + School.totalMoneySpend);

        System.out.println("Profit " + (School.totalMoneyEarned - School.totalMoneySpend));

    }
}
