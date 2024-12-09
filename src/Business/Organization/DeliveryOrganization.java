/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DeliveryPersonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class DeliveryOrganization extends Organization{
    private String orgType;
    
    public DeliveryOrganization(String orgType){
        super(Organization.Type.DeliveryPerson.getValue());
        this.orgType = orgType;
        
    }

    public String getOrganizationType() {
        return orgType;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new DeliveryPersonRole());
        return rolesArray;
    }
}
