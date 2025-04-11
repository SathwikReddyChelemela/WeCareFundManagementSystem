/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import model.Role.EducationDonationOrgAdminRole;
import model.Role.EducationKitSupplyManagerRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class EducationDonationOrg extends Organization{
    
    private String educationDonationOrgName;
    private int totalSupplyKits;
    private double totalFunds;
    
    public EducationDonationOrg(String name) {
        super(name);
        this.educationDonationOrgName=name;
    }

    public String getEducationDonationOrgName() {
        return educationDonationOrgName;
    }

    public void setEducationDonationOrgName(String educationDonationOrgName) {
        this.educationDonationOrgName = educationDonationOrgName;
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
        return Organization.orgType.EducationDonationOrg;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> role = new ArrayList();
        role.add(new EducationDonationOrgAdminRole());
        return role;
    }
    
    public double addTotalFunds(double funds){
        return totalFunds + funds;
    }
    
    public int addTotalSupplyKits(int kits){
        return totalSupplyKits + kits;
    }
    
}
