/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Emp;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author vedar
 */
public class Configuration {
     public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        
        
        Emp emp = system.getEmpDirectory().createEmp("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", emp, new SystemAdminRole());

        
        return system;
    }
}
