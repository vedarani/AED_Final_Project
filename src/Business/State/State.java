/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.State;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author nehap
 */

public class State {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public State(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
