/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author nehap
 */
public abstract class Role {
    
    public enum RoleType {
        Admin("Admin"),
        Dietician("Dietician"),
        Pathologist("Pathologist");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
