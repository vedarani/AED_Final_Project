/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.QualityApproverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class QualityApproverOrganization extends Organization {
    private String orgType;
    
    public QualityApproverOrganization(String orgType){
        super(Organization.Type.QualityApprover.getValue());
        this.orgType = orgType;        
    }

    public String getOrganizationType() {
        return orgType;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new QualityApproverRole());
        return rolesArray;
    }
}
