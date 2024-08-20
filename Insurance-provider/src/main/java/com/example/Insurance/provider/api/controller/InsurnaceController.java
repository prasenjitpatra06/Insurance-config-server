package com.example.Insurance.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/insurnaceProvider")
public class InsurnaceController {
    @GetMapping("/getAllInsurancePlan")
    public List<String> getInsurancePlan(){
        return List.of("Insurnace1", "Insurance2");
    }
}
