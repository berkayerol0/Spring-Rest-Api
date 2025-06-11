package com.berkayerol.services;

import com.berkayerol.model.Employee;
import com.berkayerol.repository.EmployeeRepository;
import com.berkayerol.request.UpdateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployeeById(String ID) {
        return employeeRepository.getEmployeeById(ID);

    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){
        return employeeRepository.getEmployeeWithParams(firstName,lastName);
    }

    public Employee saveEmployee(Employee employee) {
       return employeeRepository.saveEmployee(employee);
    }

    public boolean deleteEmployee(String ID) {
        return employeeRepository.deleteEmployee(ID);
    }

    public Employee updateEmployee(String ID, UpdateEmployeeRequest request) {
        return employeeRepository.updateEmployee(ID,request);
    }
}
