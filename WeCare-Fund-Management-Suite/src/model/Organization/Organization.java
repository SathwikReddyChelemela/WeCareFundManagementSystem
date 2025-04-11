/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import model.Employee.EmployeeDirectory;
import model.Role.Role;
import model.UserAccount.UserAccountDirectory;
import model.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public abstract class Organization {
    
    private String name;
    private int orgId;
    private WorkQueue workQueue;
    private EmployeeDirectory empDirectory;
    private UserAccountDirectory userAccountList;
    private static int counter = 1;
    public ArrayList<Role> roles;
    private orgType orgType;
    
    public enum orgType {
        DisasterReliefOrg("Disaster Relief Organization"),
        EducationDonationOrg("Education Donation Organization"),
        FundsOrg("Funds Organization"),
        DonorIndividualOrg("Individual Donor Organization"),
        DisasterReliefKitSupplyOrg("Disaster Relief Kit Supply Organization"),
        EducationKitSupplyOrg("Education Kit Supply Organization");
        
        private String value;

        private orgType(String value) {
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

    public Organization(String name) {
        this.name = name;
        orgId = counter;
        workQueue = new WorkQueue();
        empDirectory = new EmployeeDirectory();
        userAccountList = new UserAccountDirectory();
        roles = new ArrayList<Role>();
        counter ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmpDirectory() {
        return empDirectory;
    }

    public void setEmpDirectory(EmployeeDirectory empDirectory) {
        this.empDirectory = empDirectory;
    }

    public UserAccountDirectory getuserAccountList() {
        return userAccountList;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountList = userAccountDirectory;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public orgType getOrgType() {
        return orgType;
    }

    public void setOrgType(orgType orgType) {
        this.orgType = orgType;
    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
}
