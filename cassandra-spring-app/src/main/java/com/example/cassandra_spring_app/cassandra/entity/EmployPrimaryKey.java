package com.example.cassandra_spring_app.cassandra.entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class EmployPrimaryKey {


    @PrimaryKeyColumn(name = "location", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    public final String location;

    @PrimaryKeyColumn(name = "department", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    public final String department;

    @PrimaryKeyColumn(name = "name", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    public final String name;

    public EmployPrimaryKey(String location, String department, String name) {
        this.location = location;
        this.department = department;
        this.name = name;
    }
}
