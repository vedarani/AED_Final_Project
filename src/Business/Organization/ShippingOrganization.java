/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShippingManagerRole;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class ShippingOrganization extends Organization {
    private String orgType;
    
    public ShippingOrganization(String orgType){
        super(Organization.Type.ShippingManager.getValue());
        this.orgType = orgType;
    }

    public String getOrganizationType() {
        return orgType;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new ShippingManagerRole());
        return rolesArray;
    }
}
