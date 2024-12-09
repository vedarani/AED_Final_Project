/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Vendor;

import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class VendorDirectory {
    private ArrayList<Vendor> vendorsArray;

    public VendorDirectory() {
        vendorsArray = new ArrayList();
    }

    public Vendor createVendor(String name) {
        for (Vendor vendorArray : vendorsArray) {
            if (vendorArray.getVendorName().equals(name)) {
                return null;
            }
        }
        Vendor vendor = new Vendor(name);
        this.vendorsArray.add(vendor);
        return vendor;
    }

    public void deleteVendorsUnit(Vendor vend) {
        vendorsArray.remove(vend);
    }

    public ArrayList<Vendor> getVendorsArray() {
        return vendorsArray;
    }
}
