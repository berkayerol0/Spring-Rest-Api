package com.berkayerol.repository;

import com.berkayerol.model.Employee;
import com.berkayerol.request.UpdateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList() {

        return employeeList;
    }

    public Employee getEmployeeById(String ID) {
        Employee findEmployee = null;
        for (Employee employee: employeeList) {
            if(ID.equals(employee.getID())) {
                findEmployee = employee;
                break;
            }
        }
        return findEmployee;
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){
        List<Employee> employeeWithParams = new ArrayList<>();

        if (firstName == null && lastName==null) {
            return employeeList;
        }
        for (Employee employee: employeeList){
            if(firstName != null && lastName != null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)) {
                    employeeWithParams.add(employee);
                }
            }

            if(firstName != null && lastName == null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName)) {
                    employeeWithParams.add(employee);
                }
            }

            if(lastName != null && firstName == null) {
                if(employee.getLastName().equalsIgnoreCase(lastName)) {
                    employeeWithParams.add(employee);
                }
            }

        }

        return employeeWithParams;

    }

    public Employee saveEmployee(Employee employee){
        employeeList.add(employee);
        return employee; //kaydedilen nesne bu
    }

    public boolean deleteEmployee(String ID) {
        Employee deleteEmployee = null;
        for(Employee employee:employeeList) {
            if(ID.equals(employee.getID())) {
                deleteEmployee= employee;
                break;
            }
        }
        if(deleteEmployee==null) {
            return false;
        }
        employeeList.remove(deleteEmployee);
        return true;
    }

    private Employee findEmployeeById(String ID) {
        Employee findEmployee = null;
        for(Employee employee: employeeList) {
            if(employee.getID().equals(ID)) {
                findEmployee = employee;
                break;
            }
        }
        return findEmployee;
    }

    public Employee updateEmployee(String ID, UpdateEmployeeRequest request) {
        Employee findEmployee = findEmployeeById(ID);
        if(findEmployee!= null) {
            deleteEmployee(ID);

            Employee updatedEmployee = new Employee();
            updatedEmployee.setID(ID);
            updatedEmployee.setFirstName(request.getFirstName());
            updatedEmployee.setLastName(request.getLastName());

            employeeList.add(updatedEmployee);
            return updatedEmployee;
        }
        return null;
    }

}
