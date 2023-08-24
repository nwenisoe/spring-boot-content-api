package com.example.springbootcontentapi.dao;

import com.example.springbootcontentapi.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
