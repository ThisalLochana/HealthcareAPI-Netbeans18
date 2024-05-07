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
    private Patient patient; // The patient associated with the medical record
    private String diagnosis; // The diagnosis for the patient
    private String treatment; // The treatment prescribed for the patient
    
    /**
     * Default constructor for MedicalRecord class.
     */
    public MedicalRecord() {
        
    }

    /**
     * Constructs a MedicalRecord object with specified attributes.
     * @param patient The patient associated with the medical record.
     * @param diagnosis The diagnosis for the patient.
     * @param treatment The treatment prescribed for the patient.
     */
    public MedicalRecord(Patient patient, String diagnosis, String treatment) {
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    /**
     * Returns the patient associated with the medical record.
     * @return The patient associated with the medical record.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Returns the diagnosis for the patient.
     * @return The diagnosis for the patient.
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Returns the treatment prescribed for the patient.
     * @return The treatment prescribed for the patient.
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * Sets the patient associated with the medical record.
     * @param patient The patient associated with the medical record.
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Sets the diagnosis for the patient.
     * @param diagnosis The diagnosis for the patient.
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Sets the treatment prescribed for the patient.
     * @param treatment The treatment prescribed for the patient.
     */
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
