package com.example.cassandra_spring_app.cassandra.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Employee {

    @PrimaryKey
    public final EmployPrimaryKey key;

    @Column
    public String phoneNumber;

    public Employee(EmployPrimaryKey key, String phoneNumber) {
        this.key = key;
        this.phoneNumber = phoneNumber;
    }
}
