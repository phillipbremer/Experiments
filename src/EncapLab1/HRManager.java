/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncapLab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pbremer
 */
public class HRManager {
    private Employee employee;
    
    /* public void hireEmployee(Employee emp){
        employee = emp;
    }
    
    //Secondary option
   public void orientNewEmployee(Employee emp){
        employee = emp;
    }*/
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setSsn(ssn);
        orientEmployee();
        employee = emp;
    }
    
    public void orientEmployee(){
        employee.doOrientation("A101");
    }
    
        public String getEmployeeStatus() {
        return employee.getStatus();
        }
    
}
