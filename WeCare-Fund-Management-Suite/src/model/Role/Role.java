/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import configuration.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author team-11
 */
public abstract class Role {
    
    public enum RoleType {
        SystemAdmin("System Administrator"),
        DonationAdmin("Donation Admin"),
        FundsAdmin("Funds Admin"),
        KitSupplyAdmin("Kit Supply Admin"),
        DonorAdmin("Donor Admin"),
        DonorIndividual("Donor"),
        DisasterReliefOrgAdminRole("Disaster Relief Org"),
        EducationDonationOrgAdminRole("Education Donation Org"),
        DisasterReliefKitSupplyManager("Disaster Relief Kit Supply Manager"),
        EducationKitSupplyManager("Education Kit Supply Manager"),
        FundsOrgAdmin("Funds Admin"),
        FundsManager("Funds Manager");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            EcoSystem ecoSystem);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    

}
