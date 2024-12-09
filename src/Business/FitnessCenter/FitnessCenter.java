/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FitnessCenter;
import Business.Role.Role;
import Business.Organization.Organization;
import java.util.ArrayList;
/**
 *
 * @author vedar
 */
public class FitnessCenter extends Organization{
    
    private String fitnessCenterName;
    private String fitnessCenterAddress;

    public String getFitnessCenterName() {
        return fitnessCenterName;
    }

    public void setFitnessCenterName(String FitnessCenterName) {
        this.fitnessCenterName = FitnessCenterName;
    }

    public String getFitnessCenterAddress() {
        return fitnessCenterAddress;
    }

    public void setFitnessCenterAddress(String FitnessCenterAddress) {
        this.fitnessCenterAddress = FitnessCenterAddress;
    }
    
    public FitnessCenter(String FitnessCenterName){
        super();
        this.fitnessCenterName = FitnessCenterName;
    }
    
    @Override
    public String toString(){
        return this.fitnessCenterName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}
