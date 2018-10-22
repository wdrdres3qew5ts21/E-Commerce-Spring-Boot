package com.sanan.shop.SananShop;

import org.hibernate.Hibernate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SananShopApplicationTests {

    @Autowired
    private SubjectService testService;

    @Test
    public void testGetSubjectById() {
        Subject test = testService.getSubjectById(1);
        Hibernate.initialize(test);
        System.out.println(test);
    }

}
