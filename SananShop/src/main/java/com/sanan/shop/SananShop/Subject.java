/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanan.shop.SananShop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author wdrdr
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Subject {
    @Id
    private int id;

    private String word;

    public Subject() {

    }

    public Subject(int id, String word) {
        this.id = id;
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", word=" + word + '}';
    }

    
}
