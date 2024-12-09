/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

/**
 *
 * @author nehap
 */
public class Emp {
    
    private String empName;
    private int empId;
    private static int count = 100;

    public Emp() {
        empId = count;
        count++;
    }

    public int getId() {
        return empId;
    }

    public void setName(String empName) {
        this.empName = empName;
    }

    
    public String getName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName;
    }
}
