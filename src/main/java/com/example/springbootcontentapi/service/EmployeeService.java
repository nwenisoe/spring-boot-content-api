package com.example.springbootcontentapi.service;

import com.example.springbootcontentapi.dao.EmployeeDao;
import com.example.springbootcontentapi.entity.Employee;
import com.example.springbootcontentapi.entity.Employees;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmployeeService {
    private final EmployeeDao employeeDao;
    public Employees findAllEmployees() {
        return new Employees(employeeDao.findAll());
    }
    public Employee findById(int id){
        return employeeDao.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
    public Employee saveEmployee(Employee employee) {
       return employeeDao.save(employee);
    }
}
