/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return orgList;
    }
    
    public Organization createOrganization(String name, Type ty) {
        
        Organization org = null;
        if (ty.getValue().equals(Type.DeliveryPerson.getValue())) {
            org = new DeliveryOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.Dietitian.getValue())) {
            org = new DietitianOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.Farmer.getValue())) {
            org = new FarmerOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.InventoryManager.getValue())) {
            org = new InventoryManagerOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.NutritionAnalyst.getValue())) {
            org = new NutritionAllocationOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.Pathologist.getValue())) {
            org = new PathologistOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.QualityApprover.getValue())) {
            org = new QualityApproverOrganization(name);
            orgList.add(org);
        }
        return org;
    }
}
