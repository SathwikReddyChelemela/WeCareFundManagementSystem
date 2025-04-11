/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;

/**
 *
 * @author team-11
 */
public class DisasterReliefKitSupplyWorkRequest extends WorkRequest{
    
    private Network network;
    private Enterprise enterprise;
    private Organization.orgType orgType;
    private String name;
    private String type;
    private double kitCount;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization.orgType getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.orgType orgType) {
        this.orgType = orgType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getKitCount() {
        return kitCount;
    }

    public void setKitCount(double kitCount) {
        this.kitCount = kitCount;
    }
    
    
}
