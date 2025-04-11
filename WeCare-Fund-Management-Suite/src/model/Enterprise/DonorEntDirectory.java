/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Role.DonorAdminRole;
import model.Role.DonorRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class DonorEntDirectory extends Enterprise{
    
    public DonorEntDirectory(String name) {
        super(name, Enterprise.EntType.DonorEntDirectory);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new DonorAdminRole());
        roles.add(new DonorRole());
        return roles;
    }
    
}
