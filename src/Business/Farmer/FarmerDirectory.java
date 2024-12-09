/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Farmer;

import Business.user.User;
import java.util.ArrayList;

/**
 *
 * @author nehap
 */
public class FarmerDirectory {
    private ArrayList<Farmer> FarmerDirectory;
    
    public FarmerDirectory(){
        FarmerDirectory = new ArrayList<>();
    }
    
    public Farmer addFarmer(){
        Farmer f = new Farmer();
        FarmerDirectory.add(f);
        return f;
    }
    
    public void deleteFarmer(Farmer f){
        FarmerDirectory.remove(f);
    }
}
