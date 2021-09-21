package com.company;

import com.company.model.Employee;
import com.company.services.EmployeeDao;
import com.company.services.EmployeeDaoImpl;
import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("enter employee id: ");
        int id = sc.nextInt();

        System.out.print("enter employee name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("enter employee salary: ");
        int sal = sc.nextInt();

        System.out.print("enter employee department: ");
        sc.nextLine();
        String dept = sc.nextLine();

        System.out.print("enter employee bons: ");

        int bonus = sc.nextInt();

        Employee e = new Employee(id, name, sal, dept, bonus);
*/
        EmployeeDao dao = new EmployeeDaoImpl();
        //dao.insert(e);

        Employee emp = dao.getEmployee(1102);
        emp.setName("Amina");
        emp.setSalary(50000);
        emp.setDept_name("Advancement");
        dao.update(emp);

        dao.delete(101);
        dao.showEmployee();

    }

}
