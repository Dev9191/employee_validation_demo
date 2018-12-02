package org.sti.employee_validation_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sti.employee_validation_demo.model.Employee;
import org.sti.employee_validation_demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/save")
    public void saveAnEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }
}
