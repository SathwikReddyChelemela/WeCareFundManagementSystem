/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Role.FundsAdminRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class FundsEntDirectory extends Enterprise{
    
    public FundsEntDirectory(String name) {
        super(name, Enterprise.EntType.FundsEntDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FundsAdminRole());
        return roles;
    }
    
}
