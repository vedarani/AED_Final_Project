/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Emp;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.security.MessageDigest;

/**
 *
 * @author nehap
 */

public class UserAccount {
    private String username;
    private String password;
    private Emp emp;
    private Role role;
    private WorkQueue workQueue;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    @Override
    public String toString() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return HashPassword(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
    
     public static String HashPassword(String password){
        try {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(password.getBytes());
                byte[] rbt = md.digest();
                StringBuilder sb = new StringBuilder();
                for(byte b: rbt){
                    sb.append(String.format("%02x", b));
                }
                return sb.toString();
            } catch (Exception ex) {}
        return null;
    }
}
