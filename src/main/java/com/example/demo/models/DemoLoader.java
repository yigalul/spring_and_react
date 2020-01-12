package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    private ContectRepository contectRepository;

    @Autowired
    public DemoLoader(ContectRepository contectRepository) {
        this.contectRepository = contectRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.contectRepository.save(new Contact("Yigal", "Ulger", "Yigal.ulger@gmcil.com"));
        this.contectRepository.save(new Contact("Shiran", "Ulger", "Shiran.ulger@gmcil.com"));
        this.contectRepository.save(new Contact("Saar", "Ulger", "Saar.ulger@gmcil.com"));
    }
}
