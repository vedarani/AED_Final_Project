/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Produce;
import Business.Client.Client;
import Business.Vendor.Vendor;
/**
 *
 * @author nehap
 */
public class Produce {
    private String prodName;
    private double price;
    private int quantity;
    private Vendor vendor;
    private Client client;

    
    private String status;
    
    public Produce(String prodName, double price, int quantity){
        this.prodName = prodName;
        this.price = price;
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String productName) {
        this.prodName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setDistribution(Vendor vendor) {
        this.vendor = vendor;
    }
    
    @Override
    public String toString(){
        return prodName;
    }
}
