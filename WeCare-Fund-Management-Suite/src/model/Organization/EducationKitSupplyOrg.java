/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import model.Role.DisasterReliefOrgAdminRole;
import model.Role.EducationKitSupplyManagerRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class EducationKitSupplyOrg extends Organization{
    
    private String educationKitSupplyOrgName;
    private int totalSupplyKits;
    private double totalFunds;
    
    public EducationKitSupplyOrg(String name) {
        super(name);
        this.educationKitSupplyOrgName=name;
    }

    public String getEducationKitSupplyOrgName() {
        return educationKitSupplyOrgName;
    }

    public void setEducationKitSupplyOrgName(String educationKitSupplyOrgName) {
        this.educationKitSupplyOrgName = educationKitSupplyOrgName;
    }

    public int getTotalSupplyKits() {
        return totalSupplyKits;
    }

    public void setTotalSupplyKits(int totalSupplyKits) {
        this.totalSupplyKits = totalSupplyKits;
    }

    public double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }
    
    @Override
    public orgType getOrgType() {
        return Organization.orgType.EducationKitSupplyOrg;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> role = new ArrayList();
        role.add(new EducationKitSupplyManagerRole());
        return role;
    }
    
    public double addTotalFunds(double funds){
        return totalFunds + funds;
    }
    
    public int addTotalSupplyKits(int kits){
        return totalSupplyKits + kits;
    }
    
}
