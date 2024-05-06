/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.model;

/**
 *
 * @author THISAL
 */
public class MedicalRecord {
    private Patient patient;
    private String diagnosis;
    private String treatment;

    public MedicalRecord(Patient patient, String diagnosis, String treatment) {
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
