/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nehap
 */
public class VendorEnterprise extends Enterprise{
    
    public VendorEnterprise(String name){
        super(name,EnterpriseType.Vendor);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
