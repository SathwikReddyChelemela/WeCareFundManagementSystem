/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Role.DisasterReliefKitSupplyManagerRole;
import model.Role.EducationKitSupplyManagerRole;
import model.Role.KitSupplyAdmin;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class KitSupplyEntDirectory extends Enterprise{
    
    public KitSupplyEntDirectory(String name) {
        super(name, Enterprise.EntType.KitSupplyEntDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new KitSupplyAdmin());
        roles.add(new DisasterReliefKitSupplyManagerRole());
        roles.add(new EducationKitSupplyManagerRole());
        return roles;
    }
    
}
