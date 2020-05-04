/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Dawid
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployeeBean {
    
        public EmployeeBean(String employeeName, String employeeSurname,
                String employeeAddres, String employeeEmail){
            this.employeeName = employeeName;
            this.employeeSurname = employeeSurname;
            this.employeeAddres = employeeAddres;
            this.employeeEmail = employeeEmail;
    }
    
    private String employeeName;
    private String employeeSurname;
    private String employeeAddres;
    private String employeeEmail; 
    
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName; 
    }
    
        public String getEmployeeSurname() {
        return employeeSurname;
    }
    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname; 
    }
    
        public String getEmployeeAddres() {
        return employeeAddres;
    }
    public void setEmployeeAddres(String employeeAddres) {
        this.employeeAddres = employeeAddres; 
    }
    
        public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail; 
    }
    
    public EmployeeBean(){
        
    }
    
}
