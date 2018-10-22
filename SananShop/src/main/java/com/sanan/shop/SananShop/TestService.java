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
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public Test getTestById(int id) {
        return testRepository.getOne(id);
    }
    
    public Test saveTest(Test test){
        return testRepository.save(test);
    }

    public List<Test> getAllSubject() {
        return testRepository.findAll();
    }
    
    public boolean isTestPass(){
        return false;
    }
    
    
    
}
