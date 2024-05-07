/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.model;

/**
 *
 * @author THISAL
 */
public class Billing {
    private int id; // The unique identifier for the billing information
    private Patient patient; // The patient associated with the billing information
    private double amount; // The amount to be paid for the healthcare services
    private boolean paid; // Indicates whether the bill has been paid or not
    
    /**
     * Default constructor for Billing class.
     */
    public Billing(){
        
    }

    /**
     * Constructs a Billing object with specified attributes.
     * @param id The unique identifier for the billing information.
     * @param patient The patient associated with the billing information.
     * @param amount The amount to be paid for the healthcare services.
     * @param paid Indicates whether the bill has been paid or not.
     */
    public Billing(int id, Patient patient, double amount, boolean paid) {
        this.id = id;
        this.patient = patient;
        this.amount = amount;
        this.paid = paid;
    }

    /**
     * Returns the unique identifier for the billing information.
     * @return The unique identifier for the billing information.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the patient associated with the billing information.
     * @return The patient associated with the billing information.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Returns the amount to be paid for the healthcare services.
     * @return The amount to be paid for the healthcare services.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Returns whether the bill has been paid or not.
     * @return True if the bill has been paid, false otherwise.
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * Sets the unique identifier for the billing information.
     * @param id The unique identifier for the billing information.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the patient associated with the billing information.
     * @param patient The patient associated with the billing information.
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Sets the amount to be paid for the healthcare services.
     * @param amount The amount to be paid for the healthcare services.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Sets whether the bill has been paid or not.
     * @param paid True if the bill has been paid, false otherwise.
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
