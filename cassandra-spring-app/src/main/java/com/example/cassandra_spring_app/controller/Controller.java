package com.example.cassandra_spring_app.controller;

import com.example.cassandra_spring_app.service.CassandraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    CassandraService cassandraService;

    @GetMapping("/cassandra-test")
    public void test() {
        cassandraService.casTest();
    }
}
