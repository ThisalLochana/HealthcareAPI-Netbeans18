/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.model;

/**
 *
 * @author THISAL
 */
public class Patient extends Person {
    private String medicalHistory; // The medical history of the patient
    private String currentHealthStatus; // The current health status of the patient
    
    /**
     * Default constructor for Patient class.
     */
    public Patient() {
        super();
    }

    /**
     * Constructs a Patient object with specified attributes.
     * @param medicalHistory The medical history of the patient.
     * @param currentHealthStatus The current health status of the patient.
     * @param id The unique identifier for the patient.
     * @param name The name of the patient.
     * @param contactInformation The contact information of the patient.
     * @param address The address of the patient.
     */
    public Patient(String medicalHistory, String currentHealthStatus, int id, String name, String contactInformation, String address) {
        super(id, name, contactInformation, address);
        this.medicalHistory = medicalHistory;
        this.currentHealthStatus = currentHealthStatus;
    }

    /**
     * Returns the medical history of the patient.
     * @return The medical history of the patient.
     */
    public String getMedicalHistory() {
        return medicalHistory;
    }

    /**
     * Returns the current health status of the patient.
     * @return The current health status of the patient.
     */
    public String getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    /**
     * Sets the medical history of the patient.
     * @param medicalHistory The medical history of the patient.
     */
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    /**
     * Sets the current health status of the patient.
     * @param currentHealthStatus The current health status of the patient.
     */
    public void setCurrentHealthStatus(String currentHealthStatus) {
        this.currentHealthStatus = currentHealthStatus;
    }
}
