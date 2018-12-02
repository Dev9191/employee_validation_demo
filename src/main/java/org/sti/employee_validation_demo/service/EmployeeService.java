package org.sti.employee_validation_demo.service;

import org.sti.employee_validation_demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

     Employee   createEmployee(Employee employee);
     Optional<Employee> getEmployee(Integer id);
     List<Employee>     getAllEmployee();

}
