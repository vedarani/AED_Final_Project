/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;
import Business.FNS.FNS;
import Business.Produce.Produce;
import Business.County.County;
/**
 *
 * @author vedar
 */
public class FNSWorkApproval extends WorkRequest{
    
    private String message;
    private String status;
    private Produce produce;
    private FNS fns;
    private County county;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Produce getProduce() {
        return produce;
    }

    public void setProduce(Produce produce) {
        this.produce = produce;
    }

    public FNS getFns() {
        return fns;
    }

    public void setFns(FNS fns) {
        this.fns = fns;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }
    
    public String toString() {
        return this.message;
    }
}
    
