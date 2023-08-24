package com.example.springbootcontentapi;

import com.example.springbootcontentapi.dao.EmployeeDao;
import com.example.springbootcontentapi.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootContentApiApplication {
    private final EmployeeDao employeeDao;
    @Bean
    @Transactional
    public ApplicationRunner runner() {
        return r -> {
            List.of(
                    new Employee("Thaw","Thaw","thaw@gmail.com",2000),
                    new Employee("John","Doe","john@gmail.com",2000),
                    new Employee("William","lin","william@gmail.com",2000),
                    new Employee("Nwe","Soe","nwe@gmail.com",2000),
                    new Employee("Thomas","Hardy","thomas@gmail.com",2000)
            ).forEach(this.employeeDao::save);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootContentApiApplication.class, args);
    }

}
