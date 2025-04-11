/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;


import model.Role.SystemAdminRole;
import model.UserAccount.UserAccount;
import model.Employee.Employee;

/**
 *
 * @author team-11
 */
public class ConfigureSystem {
    
    public static EcoSystem configure() {

        EcoSystem ecosystem = EcoSystem.getInstance();

        Employee employee = ecosystem.getEmpDirectory().addEmployee("team-11");
        employee.setId(1775832);
        
        UserAccount useracc = ecosystem.getuserAccountList().addUserAccount("sysadmin", "sysadmin", new SystemAdminRole(), employee);
        
        return ecosystem;
    }
    
}
