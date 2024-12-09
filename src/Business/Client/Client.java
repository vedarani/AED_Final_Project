/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Client;

import Business.Employee.Emp;
import Business.Organization.Organization;
import Business.Role.ClientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class Client extends Organization{
    
    private int age;
    private Emp employee;
    private long phoneNumber;
    private String emailAddress;
    private String homeAddress;
    
    public Client(int age, Emp employee, long phoneNumber){
        this.age = age;
        this.employee = employee;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClientRole());
        return roles;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Emp getEmployee() {
        return employee;
    }

    public void setEmployee(Emp employee) {
        this.employee = employee;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    public String toString(){
        return employee.getName();
    }
    
}
