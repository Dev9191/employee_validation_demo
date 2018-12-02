package org.sti.employee_validation_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sti.employee_validation_demo.model.Employee;

import javax.persistence.Id;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
