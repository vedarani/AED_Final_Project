/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestListArray;
    private ArrayList<WorkRequest> workRequestListArray2;
    private ArrayList<WorkRequest> workRequestListArray3;

    public WorkQueue() {
        workRequestListArray = new ArrayList();
        workRequestListArray2 = new ArrayList();
        workRequestListArray3 = new ArrayList();
    }
    
    public ArrayList<WorkRequest> getWorkRequestListArray() {
        return workRequestListArray;
    }

    public ArrayList<WorkRequest> getWorkRequestListArray2() {
        return workRequestListArray2;
    }

    public ArrayList<WorkRequest> getWorkRequestListArray3() {
        return workRequestListArray3;
    }
    
}
