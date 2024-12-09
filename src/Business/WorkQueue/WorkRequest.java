/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author vedar
 */
public abstract class WorkRequest {

    private String msg;
    private UserAccount senderAccount;
    private UserAccount receiverAccount;
    private String status;
    private Date requestDate;
    private Date resolveDate;

    public WorkRequest() {
        requestDate = new Date();
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public UserAccount getSender() {
        return senderAccount;
    }

    public void setSender(UserAccount senderAccount) {
        this.senderAccount = senderAccount;
    }

    public UserAccount getReceiver() {
        return receiverAccount;
    }

    public void setReceiver(UserAccount receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
        
    @Override
    public String toString(){
        return this.msg;
    }
}
