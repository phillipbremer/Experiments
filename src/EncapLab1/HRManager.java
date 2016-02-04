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
    public void orientNewEmployee(String firstName, String lastName, String ssn){
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setSsn(ssn);
        emp.doOrientation("A100");
        employee = emp;
    }
        public String getEmployeeStatus() {
        return employee.getStatus();
        }
    
}
