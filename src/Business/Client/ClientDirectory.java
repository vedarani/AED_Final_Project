/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Client;

import Business.Employee.Emp;
import java.util.ArrayList;
/**
 *
 * @author vedar
 */
public class ClientDirectory {
    
    private ArrayList<Client> clientsArray;
    
    public ClientDirectory(){
        clientsArray = new ArrayList();
    }
    
    public Client createClient(int age, Emp employee, long phoneNumber){
        Client client = new Client(age,employee,phoneNumber);
        clientsArray.add(client);
        return client;
    }
    
    public ArrayList<Client> getClients(){
        return clientsArray;
    }
}
