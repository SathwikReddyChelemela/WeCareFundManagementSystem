/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import model.Organization.Organization.orgType;
import java.util.ArrayList;

/**
 *
 * @author team-11
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> orgList;
    
    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Organization> orgList) {
        this.orgList = orgList;
    }
    
    public Organization addOrganization(orgType type, String name) {
        Organization organization = null;
        if (type.getValue().equals(orgType.DisasterReliefOrg.getValue())) {
            organization = new DisasterReliefOrg(name);
            DisasterReliefOrg disasterReliefOrg = (DisasterReliefOrg) organization;
            disasterReliefOrg.setDisasterReliefOrgName(name);
            orgList.add(organization);
        } else if (type.getValue().equals(orgType.EducationDonationOrg.getValue())) {
            organization = new EducationDonationOrg(name);
            EducationDonationOrg educationDonationOrg = (EducationDonationOrg) organization;
            educationDonationOrg.setEducationDonationOrgName(name);
            orgList.add(organization);
        } else if (type.getValue().equals(orgType.FundsOrg.getValue())) {
            organization = new FundsOrg(name);
            FundsOrg fundsOrg = (FundsOrg) organization;
            fundsOrg.setFundsOrgName(name);
            orgList.add(organization);
        } else if (type.getValue().equals(orgType.DonorIndividualOrg.getValue())) {
            organization = new DonorIndividualOrg(name);
            DonorIndividualOrg donorIndividualOrg = (DonorIndividualOrg) organization;
            donorIndividualOrg.setDonorInd(name);
            orgList.add(organization);
        } else if (type.getValue().equals(orgType.DisasterReliefKitSupplyOrg.getValue())) {
            organization = new DisasterReliefKitSupplyOrg(name);
            DisasterReliefKitSupplyOrg disasterReliefKitSupplyOrg = (DisasterReliefKitSupplyOrg) organization;
            disasterReliefKitSupplyOrg.setDisasterReliefKitSupplyOrgName(name);
            orgList.add(organization);
        } else if (type.getValue().equals(orgType.EducationKitSupplyOrg.getValue())) {
            organization = new EducationKitSupplyOrg(name);
            EducationKitSupplyOrg educationKitSupplyOrg = (EducationKitSupplyOrg) organization;
            educationKitSupplyOrg.setEducationKitSupplyOrgName(name);
            orgList.add(organization);
        } 

        return organization;
    }

}
