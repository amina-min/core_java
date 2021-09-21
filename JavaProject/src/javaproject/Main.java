package javaproject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Teacher bodrul = new Teacher(110, " Bodrul ", 15000);
        Teacher rima = new Teacher(111, "Rima ", 12000);
        Teacher rabu = new Teacher(112, "Rabu ", 22000);
        Teacher tasnova = new Teacher(113, "Tasnova ", 10000);
        Teacher nilima = new Teacher(114, "Nilima ", 18000);
        
        //Teacher List
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(bodrul);
        teacherList.add(rima);
        teacherList.add(rabu);
        teacherList.add(tasnova);
        teacherList.add(nilima);
        
        
        Student sumi = new Student(1, "Sumi", 10);
        Student rumi = new Student(2, "Rumi", 20);
        Student nila = new Student(3, "Nila", 10);
        Student nitu = new Student(4, "Nitu", 12);
        Student sithi = new Student(5, "Sithi", 15);
        
        //Student List
        List<Student> studentList = new ArrayList<>();
        studentList.add(sumi);
        studentList.add(rumi);
        studentList.add(nila);
        studentList.add(nitu);
        studentList.add(sithi);
        
        //Student FeesPay
        
        sumi.setFeesPaid(8000);
        rumi.setFeesPaid(5000);
        nila.setFeesPaid(10000);
        nitu.setFeesPaid(8000);
        sithi.setFeesPaid(10000);

        System.out.println("sumi " + sumi.getFeesTotal());
        System.out.println("rui " + rumi.getFeesTotal());
        System.out.println("nila " + nila.getFeesTotal());
        System.out.println("nitu " + nitu.getFeesTotal());
        System.out.println("sithi " + sithi.getFeesTotal());

        bodrul.setSalary(bodrul.getSalary());
        bodrul.setSalary(bodrul.getSalary());
        rima.setSalary(rima.getSalary());
        rabu.setSalary(rabu.getSalary());
        tasnova.setSalary(tasnova.getSalary());
        nilima.setSalary(nilima.getSalary());
        
        System.out.println("bodrul " + bodrul.getSalary());
        
        System.out.println("School Earned "+ School.totalMoneyEarned);
        System.out.println("School Spend "+ School.totalMoneySpend);
        
        System.out.println("Profit "+ (School.totalMoneyEarned-School.totalMoneySpend));

    }

}
