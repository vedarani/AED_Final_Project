/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Client.Client;
import Business.County.County;
import Business.FitnessCenter.FitnessCenter;
import Business.Order.Order;
import Business.Produce.Produce;
import Business.Vendor.Vendor;

/**
 *
 * @author nehap
 */
public class ShippingOrderWR extends WorkRequest{
    
    private Order orders;
    private County county;
    private String message;
    private Vendor vendor;

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
    
    @Override
    public String toString() {
        return this.message;
    }
    
}
