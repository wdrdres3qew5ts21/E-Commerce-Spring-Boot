package com.sanan.shop.SananShop;

import javax.transaction.Transactional;
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
    private SubjectService subjectService;

    @Test
    @Transactional
    public void testGetSubjectById() {
        Subject actualSubject = subjectService.getSubjectById(1);
        Subject expectedSubject = new Subject(1, "Software Process INT 202");
        System.out.println("Expect : " + expectedSubject);
        System.out.println("Actual : " + actualSubject);
        Assert.assertEquals(expectedSubject.toString(), actualSubject.toString());
    }

}
