/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FNS;

import java.util.ArrayList;

/**
 *
 * @author nehap
 */
public class FNSDirectory {
    private ArrayList<FNS> fnsArray;
    
    public FNSDirectory(){
        this.fnsArray = new ArrayList();
    }
    
    public FNS createFNS(String name){
        
        for (FNS fns:fnsArray){
            if(fns.getFNSName().equals(name)){
                return null;
            }
        }
        
        FNS fns = new FNS(name);
        this.fnsArray.add(fns);
        return fns;
    }
    
    public void deleteFNS(String name){
        for (FNS fns:fnsArray){
            if(fns.getFNSName().equals(name)){
                fnsArray.remove(fns);
                break;
            }
        }
    }

    public ArrayList<FNS> getFNS() {
        return fnsArray;
    }
}
