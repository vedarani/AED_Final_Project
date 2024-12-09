/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Client.ClientDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.State.State;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class EcoSystem extends Organization {

   private static EcoSystem business;
    private ArrayList<State> stateList;
    private ClientDirectory clientDirectory;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public State createAndAddState(){
        State state=new State();
        stateList.add(state);
        return state;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        stateList=new ArrayList<State>();
        clientDirectory = new ClientDirectory();
    }

    public ClientDirectory getClientDirectory() {
        return clientDirectory;
    }
    
    

    public ArrayList<State> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<State> stateList) {
        this.stateList = stateList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
//        for(State state:stateList){
//
//        }    
       
            return this.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
    }
}
