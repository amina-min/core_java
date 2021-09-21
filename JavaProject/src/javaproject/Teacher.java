package javaproject;

public class Teacher {

    private int id;
    private String St_Name;
    private int salary;

    public Teacher(int id, String St_Name, int salary) {
        this.id = id;
        this.St_Name = St_Name;
        this.salary = salary;
    }    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        School.totalMoneySpend+=salary;
    }

}
