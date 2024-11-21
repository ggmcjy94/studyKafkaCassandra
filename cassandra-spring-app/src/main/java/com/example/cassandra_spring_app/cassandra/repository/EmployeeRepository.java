package com.example.cassandra_spring_app.cassandra.repository;

import com.example.cassandra_spring_app.cassandra.entity.EmployPrimaryKey;
import com.example.cassandra_spring_app.cassandra.entity.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, EmployPrimaryKey> {


    List<Employee> findByKeyLocationAndKeyDepartment(final String location, final String department);


}
