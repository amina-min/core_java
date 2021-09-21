
package com.company.model;


public class Employee{
    int id;
    String Name;
    int salary;
    String dept_name;
    int bonus;

    public Employee() {
    }

    public Employee(int id, String Name, int salary, String dept_name, int bonus) {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
        this.dept_name = dept_name;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", Name=" + Name + ", salary=" + salary + ", dept_name=" + dept_name + ", bonus=" + bonus + '}';
    }
    
}
