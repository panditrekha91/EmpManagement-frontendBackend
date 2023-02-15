package com.Aspire.EmployeeManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aspire.EmployeeManager.Entity.Employee;

@Repository
public interface EmpInterface extends JpaRepository<Employee, Long> {

}
