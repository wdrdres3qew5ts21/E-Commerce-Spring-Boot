/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanan.shop.SananShop;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author wdrdr
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;
    
    @GetMapping("/subject")
    public List<Subject> getAllTest() {
        return subjectService.getAllSubject();
    }
    
    @GetMapping("/subject/{id}")
    public Subject getTestById(@PathVariable int id) {
        return subjectService.getSubjectById(id);
    }

}
