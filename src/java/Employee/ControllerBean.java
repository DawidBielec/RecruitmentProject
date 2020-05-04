/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Ada
 */
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;

@ManagedBean
@SessionScoped
public class ControllerBean {
    
    private List<EmployeeBean> employeeList;
    private EmployeeBean employee;
    
    @PostConstruct
    public void init(){
        
        employeeList = new ArrayList<EmployeeBean>();
        
        employeeList.add(new EmployeeBean("Witold","Kowalski","Krzywa 6","Witold.ko@gmail.com"));
        employeeList.add(new EmployeeBean("Krzysztof","Nowak","Długa 6","Krzysztof.no@gmail.com"));
        
        employee= new EmployeeBean("","","","");
    }
    
    public List<EmployeeBean> getEmployeelist() {
        return employeeList;
    }
    public void setEmployeeList(List<EmployeeBean> employeeList) {
        this.employeeList = employeeList; 
    }
    
    public EmployeeBean getEmployee() {
        return employee;
    }
    public void setEmployee(EmployeeBean employee) {
        this.employee = employee; 
    }
    
    public void update(){
        employee=new EmployeeBean("","","","");
    }
    
    public void delete(){
        employeeList.remove(employee);
        employee= new EmployeeBean("","","","");
    }
    
        public void add(){
        employeeList.add(employee);
        employee= new EmployeeBean("","","","");
    }
    
}
