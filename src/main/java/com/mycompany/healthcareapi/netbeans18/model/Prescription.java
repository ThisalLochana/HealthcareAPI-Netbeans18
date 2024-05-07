/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.model;

/**
 *
 * @author THISAL
 */
public class Prescription {
    private int id; // The unique identifier for the prescription
    private Patient patient; // The patient associated with the prescription
    private String medication; // The medication prescribed
    private String dosage; // The dosage of the medication
    private String instructions; // The instructions for taking the medication
    
    /**
     * Default constructor for Prescription class.
     */
    public Prescription(){
        
    }
    

    /**
     * Constructs a Prescription object with specified attributes.
     * @param id The unique identifier for the prescription.
     * @param patient The patient associated with the prescription.
     * @param medication The medication prescribed.
     * @param dosage The dosage of the medication.
     * @param instructions The instructions for taking the medication.
     */
    public Prescription(int id, Patient patient, String medication, String dosage, String instructions) {
        this.id = id;
        this.patient = patient;
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    /**
     * Returns the unique identifier for the prescription.
     * @return The unique identifier for the prescription.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the patient associated with the prescription.
     * @return The patient associated with the prescription.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Returns the medication prescribed.
     * @return The medication prescribed.
     */
    public String getMedication() {
        return medication;
    }

    /**
     * Returns the dosage of the medication.
     * @return The dosage of the medication.
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * Returns the instructions for taking the medication.
     * @return The instructions for taking the medication.
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the unique identifier for the prescription.
     * @param id The unique identifier for the prescription.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the patient associated with the prescription.
     * @param patient The patient associated with the prescription.
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Sets the medication prescribed.
     * @param medication The medication prescribed.
     */
    public void setMedication(String medication) {
        this.medication = medication;
    }

    /**
     * Sets the dosage of the medication.
     * @param dosage The dosage of the medication.
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     * Sets the instructions for taking the medication.
     * @param instructions The instructions for taking the medication.
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
