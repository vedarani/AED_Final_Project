
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.Produce.Produce;
import Business.UserAccount.UserAccount;
import Business.user.User;
import java.util.Date;

/**
 *
 * @author nehap
 */
public abstract class WorkRequest1 {

  private String msg;
    private UserAccount senderAccount;
    private UserAccount receiverAccount;
    private String status;
  

    public WorkRequest1() {
      
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

    
        
    @Override
    public String toString(){
        return this.msg;
    }
    
            
}
