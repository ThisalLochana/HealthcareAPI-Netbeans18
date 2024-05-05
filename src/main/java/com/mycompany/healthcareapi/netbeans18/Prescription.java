/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18;

/**
 *
 * @author THISAL
 */
public class Prescription {
    private int id;
    private Patient patient;
    private String medication;
    private String dosage;
    private String instructions;
    //private String duration;

    public Prescription(int id, Patient patient, String medication, String dosage, String instructions) {
        this.id = id;
        this.patient = patient;
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getMedication() {
        return medication;
    }

    public String getDosage() {
        return dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
    
}
