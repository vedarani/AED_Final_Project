/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.County;

import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class CountyDirectory {
    
    private ArrayList<County> countyArray;
    
    public CountyDirectory(){
        this.countyArray = new ArrayList();
    }
    
    public County createCounty(String name) {

        for (County county : countyArray) {
            if (county.getCounty().equals(name)) {
                return null;
            }
        }

        County county = new County(name);
        this.countyArray.add(county);
        return county;
    }

    public ArrayList<County> getCountyDirectoryArray() {
        return countyArray;
    }

    public void deleteCounty(County county) {
        countyArray.remove(county);
    }
}
