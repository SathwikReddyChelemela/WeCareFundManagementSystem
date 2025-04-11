/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author team-11
 */
public abstract class Enterprise extends Organization{
    
    private Organization org;
    private OrganizationDirectory orgDirectory;
    private WorkQueue workQueue;
    private EntType entType;
    
    public Enterprise(String name, EntType type) {
        super(name);
        this.entType = type;
        orgDirectory = new OrganizationDirectory();
    }
    
    public enum EntType {
        DonationEntDirectory("Donation Enterprise Directory"), 
        FundsEntDirectory("Funds Enterprise Directory"),
        KitSupplyEntDirectory("Kit Supply Enterprise Directory"), 
        DonorEntDirectory("Donor Enterprise Directory");

        private String value;

        private EntType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EntType getEntType() {
        return entType;
    }

    public void setEntType(EntType entType) {
        this.entType = entType;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public OrganizationDirectory getOrgDirectory() {
        return orgDirectory;
    }

    public void setOrgDirectory(OrganizationDirectory orgDirectory) {
        this.orgDirectory = orgDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    
    
}
