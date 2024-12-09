/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FitnessCenter;

import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class FitnessCenterDirectory {
    
    private ArrayList<FitnessCenter> fitnessCentersArray;
    
    public FitnessCenterDirectory() {
        this.fitnessCentersArray = new ArrayList();
    }
    
    public FitnessCenter createFitnessCenter(String name){
        for (FitnessCenter FitnessCenterArray : fitnessCentersArray){
            if(FitnessCenterArray.getFitnessCenterName().equals(name)){
                return null;
            }
        }
        
        FitnessCenter fitnessCenter = new FitnessCenter(name);
        this.fitnessCentersArray.add(fitnessCenter);
        return fitnessCenter;
}
    
    public void deleteFitnessCenter(String name) {
        for (FitnessCenter fitnessCenterArray : fitnessCentersArray) {
            if (fitnessCenterArray.getFitnessCenterName().equals(name)) {
                fitnessCentersArray.remove(fitnessCenterArray);
                break;
            }
        }
    }

    public ArrayList<FitnessCenter> getFitnessCentersArray() {
        return fitnessCentersArray;
    }

    public void setFitnessCentersArray(ArrayList<FitnessCenter> fitnessCentersArray) {
        this.fitnessCentersArray = fitnessCentersArray;
    }
    
    
}