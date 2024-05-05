/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18;

/**
 *
 * @author THISAL
 */
public class Doctor extends Person{
    private String specialization;

    public Doctor(String specialization, int id, String name, String contactInfomation, String address) {
        super(id, name, contactInfomation, address);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
}
