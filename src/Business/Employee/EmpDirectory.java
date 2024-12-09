/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author vedar
 */
public class EmpDirectory {
    
    private ArrayList<Emp> empArray;

    public EmpDirectory() {
        empArray = new ArrayList();
    }

    public ArrayList<Emp> getEmpList() {
        return empArray;
    }
    
    public Emp createEmp(String empName){
        Emp emp = new Emp();
        emp.setName(empName);
        empArray.add(emp);
        System.out.println(emp + " ");
        return emp;
    }
    
    public void deleteEmp(Emp emo){
        empArray.remove(emo);
    }
    
}
