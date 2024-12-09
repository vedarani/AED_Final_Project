/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Farmer;

import Business.FNS.FNSDirectory;

/**
 *
 * @author nehap
 */
public class Farmer {
    private int userId;
    private String userName;
    private String password;
    private String auth;  
    private static int count = 100;
    private String SelectFNS;
    
    private FNSDirectory FNSDirectory;
    
    public FNSDirectory getFNSDirectory() {
        return FNSDirectory;
    }

    public void setFNSDirectory(FNSDirectory FNSDirectory) {
        this.FNSDirectory = FNSDirectory;
    }
    
    public Farmer() {
        userId = count;
        count++;
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

    public String getSelectFNS() {
        return SelectFNS;
    }

    public void setSelectFNS(String SelectFNS) {
        this.SelectFNS = SelectFNS;
    }

}
