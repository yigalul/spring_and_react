package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactAndSpringRest {

    @Autowired
    ContectRepository contectRepository;

    @GetMapping("/contact/{id}")
    public Contact getContactById(@PathVariable() Long id) {
        return contectRepository.findById(id).get();
    }
}
