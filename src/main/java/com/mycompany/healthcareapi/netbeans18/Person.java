/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18;

/**
 *
 * @author THISAL
 */
public class Person {
    private int id;
    private String name;
    private String contactInfomation;
    private String address;

    public Person(int id, String name, String contactInfomation, String address) {
        this.id = id;
        this.name = name;
        this.contactInfomation = contactInfomation;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactInfomation() {
        return contactInfomation;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfomation(String contactInfomation) {
        this.contactInfomation = contactInfomation;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
