/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanan.shop.SananShop.login;

import java.security.Principal;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@CrossOrigin
@RestController
public class LoginController {

    @RequestMapping("/")
    public String helloWrold() {
        return "Homepage";
    }
    
    @RequestMapping("/test")
    public String page() {
        return "Test";
    }

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("Try to login");
        System.out.println(principal);
        return principal;
    }
    

}
