/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Emp;
import Business.Role.Role;
import java.security.MessageDigest;
import java.util.ArrayList;

/**
 *
 * @author nehap
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountArray;
    
    public UserAccountDirectory(){
        userAccountArray = new ArrayList();
    }
    
    public ArrayList<UserAccount> getUserAccountList(){
        return userAccountArray;
    }
    
    public UserAccount authentication(String username, String password){
        for (UserAccount userAccount : userAccountArray){
            System.out.println(userAccount.getUsername() + " : " + userAccount.getPassword());
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password))
                return userAccount;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Emp emp, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmp(emp);
        userAccount.setRole(role);
        userAccountArray.add(userAccount);
        return userAccount;
    }
    
    public void removeUser(UserAccount userAccount){
        if(userAccount==null){
            return;
        }
        userAccountArray.remove(userAccount);
    } 
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount userAccount : userAccountArray){
            if (userAccount.getUsername().equals(username))
                return false;
        }
        return true;
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
