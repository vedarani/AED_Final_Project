/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Vendor.Vendor;
import Business.Vendor.VendorDirectory;
import Business.FNS.FNS;
import Business.FNS.FNSDirectory;
import Business.FitnessCenter.FitnessCenter;
import Business.FitnessCenter.FitnessCenterDirectory;
import Business.Organization.Organization;
import Business.County.County;
import Business.County.CountyDirectory;
import Business.Organization.OrganizationDirectory;






/**
 *
 * @author yugal
 */
public abstract class Enterprise extends Organization{
    
    
    private EnterpriseType enterpriseType;
    private CountyDirectory countyDirectory;
    private FitnessCenterDirectory fitnesscenterDirectory;
    private VendorDirectory vendorDirectory;
    private FNSDirectory fnsDirectory;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        countyDirectory = new CountyDirectory();
        vendorDirectory = new VendorDirectory();
        fitnesscenterDirectory = new FitnessCenterDirectory();
        fnsDirectory = new FNSDirectory();
        organizationDirectory = new OrganizationDirectory();
    }

    public enum EnterpriseType{
        FitnessCenter("Fitness Center"),
        County("County"),
        FNS("FNS"),
        Vendor("Vendor");

        private String value;

        public String getValue() {
            return value;
        }

        private EnterpriseType(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    public County createCounty(String name){
        return countyDirectory.createCounty(name);
    }
    
    public Vendor createVendor(String name){
        return vendorDirectory.createVendor(name);
    }
    
    public FNS createFNS(String name){
        return fnsDirectory.createFNS(name);
    }
    
    public FitnessCenter createFitnessCenter(String name){
        return fitnesscenterDirectory.createFitnessCenter(name);
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public CountyDirectory getCountyDirectory() {
        return countyDirectory;
    }

    public void setCountyDirectory(CountyDirectory countyDirectory) {
        this.countyDirectory = countyDirectory;
    }

    public FitnessCenterDirectory getFitnesscenterDirectory() {
        return fitnesscenterDirectory;
    }

    public void setFitnesscenterDirectory(FitnessCenterDirectory fitnesscenterDirectory) {
        this.fitnesscenterDirectory = fitnesscenterDirectory;
    }

    public VendorDirectory getVendorDirectory() {
        return vendorDirectory;
    }

    public void setVendorDirectory(VendorDirectory vendorDirectory) {
        this.vendorDirectory = vendorDirectory;
    }

    public FNSDirectory getFnsDirectory() {
        return fnsDirectory;
    }

    public void setFnsDirectory(FNSDirectory fnsDirectory) {
        this.fnsDirectory = fnsDirectory;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
        
}
