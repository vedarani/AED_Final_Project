/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Client.Client;
import Business.FitnessCenter.FitnessCenter;
import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class DietitianWR extends WorkRequest{
    
    private ArrayList <String> IssueArray;
    private Client client;
    private FitnessCenter fitnessCenterName;
    private String message;
    private String test;
    
    public DietitianWR(){
        IssueArray = new ArrayList();
    }

    public ArrayList<String> getIssueArray() {
        return IssueArray;
    }

    public void setIssueArray(ArrayList<String> IssueArray) {
        this.IssueArray = IssueArray;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public FitnessCenter getFitnessCenterName() {
        return fitnessCenterName;
    }

    public void setFitnessCenterName(FitnessCenter fitnessCenterName) {
        this.fitnessCenterName = fitnessCenterName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
    public void addIssue(String issue){
        this.IssueArray.add(issue);
    }
    
    @Override
    public String toString(){
        return message;
    }
    
}


