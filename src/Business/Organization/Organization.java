/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmpDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmpDirectory empDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int orgID;  
    private static int counter = 8000;
    
    public enum Type{
        Farmer("Farmer"), 
        NutritionAnalyst("Nutrition Analyst"),
        QualityApprover("Quality Approver"), 
        InventoryManager("Inventory Manager"), 
        DeliveryPerson("Delivery Person"), 
        Dietitian("Dietitian"),
        ShippingManager("Shipping Manager"),
        Pathologist("Pathologist");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        empDirectory = new EmpDirectory();
        userAccountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }
    
    public Organization(){
        this.name = name;
        workQueue = new WorkQueue();
        empDirectory = new EmpDirectory();
        userAccountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return orgID;
    }

    public EmpDirectory getEmpDirectory() {
        return empDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
