/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.InventoryManagerRole;
import Business.Role.Role;

/**
 *
 * @author vedar
 */
public class InventoryManagerOrganization extends Organization {
    private String orgType;
    
    public InventoryManagerOrganization(String orgType){
        super(Organization.Type.InventoryManager.getValue());
        this.orgType = orgType;        
    }

    public String getOrganizationType() {
        return orgType;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new InventoryManagerRole());
        return rolesArray;
    }
}
