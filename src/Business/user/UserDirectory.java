/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.user;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author nehap
 */
public class UserDirectory {
    private ArrayList<User> UserDirectory;
    
    public UserDirectory(){
        UserDirectory = new ArrayList<>();
    }

    public ArrayList<User> getUserDirectory() {
        return UserDirectory;
    }

    public void setUserDirectory(ArrayList<User> UserDirectory) {
        this.UserDirectory = UserDirectory;
    }
    
    public User addUser(){
        User User = new User();
        UserDirectory.add(User);
        return User;
    }
    
    public void deleteUser(User u){
        UserDirectory.remove(u);
    }
    
    public User getUserDetails(String userName, String hash) {
        User user = new User();
        for(User k : UserDirectory){
            if(userName.compareTo(k.getUserName()) == 0 && hash.compareTo(k.getPassword())==0){
                user =k;
                System.out.println("User Found");
                break;
            }
            
        }
        return user;
    }

    public User getUserfromId(int search) {
        User result = new User();
        for(User k : UserDirectory){
             if(k.getUserId()==search)
                result=k;
        }    
        return result;
    }
    public String get_SHA_512_SecurePassword(String passwordToHash, String   salt) throws UnsupportedEncodingException{
        String generatedPassword = null;
        try {
             MessageDigest md = MessageDigest.getInstance("SHA-512");
             md.update(salt.getBytes("UTF-8"));
             byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
             StringBuilder sb = new StringBuilder();
             for(int i=0; i< bytes.length ;i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
             }
             generatedPassword = sb.toString();
            } 
           catch (NoSuchAlgorithmException e){
            e.printStackTrace();
           }
        
        return generatedPassword;
    }
}
