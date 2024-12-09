/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FNS;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nehap
 */
public class FNS extends Organization {
    private String name;
    
    public FNS(String name){
        super();
        this.name = name;
    }

    public String getFNSName() {
        return name;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public String toString(){
        return this.getFNSName();
    }
}
