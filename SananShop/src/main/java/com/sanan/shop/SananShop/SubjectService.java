/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanan.shop.SananShop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wdrdr
 */

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject getSubjectById(int id) {
        return subjectRepository.getOne(id);
    }
    
    public Subject saveTest(Subject test){
        return subjectRepository.save(test);
    }

    public List<Subject> getAllSubject() {
        return subjectRepository.findAll();
    }
    
    
    
}
