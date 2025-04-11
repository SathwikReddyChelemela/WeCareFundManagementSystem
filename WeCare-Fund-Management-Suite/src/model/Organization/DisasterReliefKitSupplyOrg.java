/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import model.Role.DisasterReliefKitSupplyManagerRole;
import model.Role.FundsAdminRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class DisasterReliefKitSupplyOrg extends Organization{
    
    private String disasterReliefKitSupplyOrgName;
    private int totalSupplyKits;
    private double totalFunds;
    
    public DisasterReliefKitSupplyOrg(String name) {
        super(name);
        this.disasterReliefKitSupplyOrgName=name;
    }

    public String getDisasterReliefKitSupplyOrgName() {
        return disasterReliefKitSupplyOrgName;
    }

    public void setDisasterReliefKitSupplyOrgName(String disasterReliefKitSupplyOrgName) {
        this.disasterReliefKitSupplyOrgName = disasterReliefKitSupplyOrgName;
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
        return Organization.orgType.DisasterReliefKitSupplyOrg;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> role = new ArrayList();
        role.add(new DisasterReliefKitSupplyManagerRole());
        return role;
    }
    
    public double addTotalFunds(double funds){
        return totalFunds + funds;
    }
    
    public int addTotalSupplyKits(int kits){
        return totalSupplyKits + kits;
    }
}
