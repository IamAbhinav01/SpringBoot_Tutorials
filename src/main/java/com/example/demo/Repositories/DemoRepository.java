package com.example.demo.Repositories;

import com.example.demo.Schemas.Demo;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class DemoRepository {
    public  List<Demo> demos = new ArrayList<>(Arrays.asList(
            new Demo("2","Complete Spring Boot"),
            new Demo("3","Complete DSA Theory"),
            new Demo("4","Build NodeJS knowledge")
    ));
    public List<Demo>findAll(){
        return demos;
    }
}
