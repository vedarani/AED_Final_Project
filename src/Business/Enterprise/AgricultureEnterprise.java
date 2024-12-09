/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author vedar
 */
public class AgricultureEnterprise extends Enterprise{
    
    public AgricultureEnterprise(String name){
        super(name, EnterpriseType.County);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}
