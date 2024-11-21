package com.example.cassandra_spring_app.service;

import com.example.cassandra_spring_app.cassandra.entity.EmployPrimaryKey;
import com.example.cassandra_spring_app.cassandra.entity.Employee;
import com.example.cassandra_spring_app.cassandra.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CassandraService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void casTest() {
        Employee employee = new Employee(new EmployPrimaryKey("seoul", "business", "key"), "010-1111-2222");
        employeeRepository.save(employee);
        Employee employee2 = new Employee(new EmployPrimaryKey("seoul", "business", "joy"), "010-1111-3333");
        employeeRepository.save(employee2);


        var res = employeeRepository.findByKeyLocationAndKeyDepartment("seoul", "business");

        res.stream().map(a -> String.format("location : %s , dep: %s , name : %s , phone : %s",a.key.location,a.key.department,a.key.name,a.phoneNumber))
                .forEach(System.out::println);


    }


}
