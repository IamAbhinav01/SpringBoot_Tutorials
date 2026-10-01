package com.example.demo.Contollrer;

import com.example.demo.Schemas.Demo;
import com.example.demo.Services.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demos")
@AllArgsConstructor
public class ControllerDemo {
    private DemoService demoService;
    @GetMapping
    public List<Demo> getAllDemos(){
        return demoService.getAllDemos();
    }
}
