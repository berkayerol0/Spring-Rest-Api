package com.berkayerol.controller;

import com.berkayerol.model.Employee;
import com.berkayerol.request.UpdateEmployeeRequest;
import com.berkayerol.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmployeeList();
    }

    @GetMapping("/list/{ID}")
    public Employee getEmployeeById(@PathVariable(name = "ID", required = true) String ID) {
        return employeeService.getEmployeeById(ID);

    }

    @GetMapping("/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName,
                                                @RequestParam(name = "lastName", required = false) String lastName){
        return employeeService.getEmployeeWithParams(firstName, lastName);
    }

    @PostMapping("/save-employee")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
        Employee saved =  employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @DeleteMapping("/delete-employee/{ID}")
    public boolean deleteEmployee(@PathVariable(name = "ID") String ID) {
        return employeeService.deleteEmployee(ID);
    }

    @PutMapping("/update-mapping/{ID}")
    public Employee updateEmployee(@PathVariable(name = "ID") String ID, @RequestBody UpdateEmployeeRequest request) {
        return employeeService.updateEmployee(ID,request);
    }
}
