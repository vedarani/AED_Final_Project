/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.user;

import Business.Produce.ProduceDirectory;

/**
 *
 * @author nehap
 */
public class User {
   private int userId;
    private String userName;
    private String password;
    private String auth;
    private ProduceDirectory ProduceDirectory;

    public ProduceDirectory getProduceDirectory() {
        return ProduceDirectory;
    }

    public void setProduceDirectory(ProduceDirectory ProduceDirectory) {
        this.ProduceDirectory = ProduceDirectory;
    }
    
    private boolean active;
    private static int count =0;
    
    public User(){
        count++;
        userId=count;
    }
    public User(String some){
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.userName);
                
    }
   
}
