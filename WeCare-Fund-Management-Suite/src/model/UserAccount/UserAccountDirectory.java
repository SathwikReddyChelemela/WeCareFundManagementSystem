/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import configuration.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Role.Role;
import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author team-11
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> uaList;

    public UserAccountDirectory() {
        uaList = new ArrayList();
    }

    public ArrayList<UserAccount> getUaList() {
        return uaList;
    }

    public void setUaList(ArrayList<UserAccount> uaList) {
        this.uaList = uaList;
    }

    public UserAccount addUserAccount(String username, String password, Role role, Employee employee) {
        UserAccount uAccount = new UserAccount();
        uAccount.setUsername(username);
        uAccount.setPassword(password);
        uAccount.setRole(role);
        uAccount.setEmployee(employee);
        uaList.add(uAccount);
        return uAccount;
    }
    
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount useracc : uaList) {
//            if (useracc.getUsername().equals(username) && useracc.getPassword().equals(password)) {
            if (useracc.getUsername().equals(username) && BCrypt.checkpw(password, useracc.getPassword())) {
                return useracc;
            }
        }
        return null;
    }
    
    //&& BCrypt.checkpw(useracc.getPassword(), password)
    
    public boolean checkUserNameUniqueness(String username) {
        for (UserAccount useracc : uaList) {
            if (useracc.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
