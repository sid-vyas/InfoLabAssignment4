package model;

import java.util.ArrayList;

public class EmployeeDirectory {
    ArrayList<Employee> allEmployees;
    
    public EmployeeDirectory() {
        this.allEmployees = new ArrayList<>();
    }

    public ArrayList<Employee> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(ArrayList<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }
    
    public void addEmployee(Employee newEmployee) {
        this.allEmployees.add(newEmployee);
    }
    
    public void removeEmployee(Employee employee) {
        this.allEmployees.remove(employee);
    }

    @Override
    public String toString() {
        return "EmployeeDirectory{" + "allEmployees =" + allEmployees + '}';
    }
}
