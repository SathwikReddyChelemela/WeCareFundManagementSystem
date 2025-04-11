/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import model.Role.DonorRole;
import model.Role.FundsAdminRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class FundsOrg extends Organization{
    
    private String fundsOrgName;
    
    public FundsOrg(String name) {
        super(name);
        this.fundsOrgName=name;
    }

    public String getFundsOrgName() {
        return fundsOrgName;
    }

    public void setFundsOrgName(String fundsOrgName) {
        this.fundsOrgName = fundsOrgName;
    }
    
    @Override
    public orgType getOrgType() {
        return Organization.orgType.FundsOrg;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> role = new ArrayList();
        role.add(new FundsAdminRole());
        return role;
    }
    
}
