package com.example.demo.Services;

import com.example.demo.Repositories.DemoRepository;
import com.example.demo.Schemas.Demo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DemoService {
    private DemoRepository demoRepository;
    public List<Demo> getAllDemos(){
        return demoRepository.findAll();
    }
}
