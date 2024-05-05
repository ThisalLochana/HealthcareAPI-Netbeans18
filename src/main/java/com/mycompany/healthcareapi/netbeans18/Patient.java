/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18;

/**
 *
 * @author THISAL
 */
public class Patient extends Person{
    private String medicalHistory;
    private String currentHealthStatus;

    public Patient(String medicalHistory, String currentHealthStatus, int id, String name, String contactInfomation, String address) {
        super(id, name, contactInfomation, address);
        this.medicalHistory = medicalHistory;
        this.currentHealthStatus = currentHealthStatus;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setCurrentHealthStatus(String currentHealthStatus) {
        this.currentHealthStatus = currentHealthStatus;
    }
    
    
}
