/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseListArray;

    public ArrayList<Enterprise> getEnterpriseListArray() {
        return enterpriseListArray;
    }

    public void setEnterpriseListArray(ArrayList<Enterprise> enterpriseListArray) {
        this.enterpriseListArray = enterpriseListArray;
    }
    
    public EnterpriseDirectory(){
        enterpriseListArray=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type) {
        
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.FitnessCenter) {
            enterprise=new FitnessCenterEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.County) {
            enterprise = new AgricultureEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Vendor) {
            enterprise = new VendorEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.FNS) {
            enterprise = new FNSEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        
        return enterprise;
    }
    
}
