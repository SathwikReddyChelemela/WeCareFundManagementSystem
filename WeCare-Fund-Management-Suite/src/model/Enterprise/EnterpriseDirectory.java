/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> entList;

    public EnterpriseDirectory() {
        entList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEntList() {
        return entList;
    }

    public void setEntList(ArrayList<Enterprise> entList) {
        this.entList = entList;
    }
    
    public void addEnterprise(String entName, Enterprise.EntType type) {
        Enterprise ent = null;
        if (type == Enterprise.EntType.DonationEntDirectory) {
            ent = new DonationEntDirectory(entName);
            entList.add(ent);
            
            
        } else if (type == Enterprise.EntType.FundsEntDirectory) {
            ent = new FundsEntDirectory(entName);
            entList.add(ent);
        } else if (type == Enterprise.EntType.KitSupplyEntDirectory) {
            ent = new KitSupplyEntDirectory(entName);
            entList.add(ent);
        } else if (type == Enterprise.EntType.DonorEntDirectory) {
            ent = new DonorEntDirectory(entName);
            entList.add(ent);
        }
    }
    
}
