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
public class EducationDonationOrgAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise ent, Network network, EcoSystem ecosystem) {
        return null;
    }
    
    @Override
    public String toString(){
        return (Role.RoleType.EducationDonationOrgAdminRole.getValue());
    }
    
    
}
