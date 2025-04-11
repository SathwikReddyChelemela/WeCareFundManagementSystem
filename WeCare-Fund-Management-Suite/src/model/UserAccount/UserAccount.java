/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import model.Employee.Employee;
import model.Role.Role;
import org.mindrot.jbcrypt.BCrypt;


/**
 *
 * @author team-11
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    private Employee employee;

    public UserAccount() {
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        
//        System.out.println("Hash from storage " + BCrypt.hashpw(password, BCrypt.gensalt(12)));
        this.password = BCrypt.hashpw(password, BCrypt.gensalt(12));
//        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
    

    
    
    
    
}
