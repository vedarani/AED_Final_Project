/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PathologistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class PathologistOrganization extends Organization{
    private String orgType;
    
    public PathologistOrganization(String orgType){
        super(Organization.Type.Pathologist.getValue());
        this.orgType = orgType;
        
    }

    public String getOrganizationType() {
        return orgType;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new PathologistRole());
        return rolesArray;
    }
}
