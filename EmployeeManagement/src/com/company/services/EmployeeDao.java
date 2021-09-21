
package com.company.services;

import com.company.model.Employee;


public interface EmployeeDao {
    public void insert(Employee e);
    public void update(Employee e);
    public Employee getEmployee(int id);
    public void delete(int id);
    public void showEmployee();
    
}
