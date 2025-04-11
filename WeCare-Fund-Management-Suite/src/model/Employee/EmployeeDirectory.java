/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> empList;

    public EmployeeDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    public Employee addEmployee(String name) {
        Employee emp = new Employee(empList.size() + 1);
        emp.setName(name);
        empList.add(emp);
        return emp;
    }
       
}
