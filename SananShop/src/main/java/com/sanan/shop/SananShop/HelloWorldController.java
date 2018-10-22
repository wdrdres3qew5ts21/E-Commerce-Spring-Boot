/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanan.shop.SananShop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author wdrdr
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class HelloWorldController {

    @Autowired
    TestService testService;
    
    @GetMapping("/test")
    public List<Test> getAllTest() {
        return testService.getAllSubject();
    }
    
    @GetMapping("/test/{id}")
    public Test getTestById(@PathVariable int id) {
        return testService.getTestById(id);
    }

}
