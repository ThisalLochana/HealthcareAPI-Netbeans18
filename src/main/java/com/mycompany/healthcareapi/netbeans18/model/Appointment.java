/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.model;

import java.time.LocalDateTime;

/**
 *
 * @author THISAL
 */
public class Appointment {
    private int id; // The unique identifier for the appointment
    private LocalDateTime dateTime; // The date and time of the appointment
    private Patient patient; // The patient associated with the appointment
    private Doctor doctor; // The doctor associated with the appointment
    
    /**
     * Default constructor for Appointment class.
     */
    public Appointment(){
        
    }

    /**
     * Constructs an Appointment object with specified attributes.
     * @param id The unique identifier for the appointment.
     * @param dateTime The date and time of the appointment.
     * @param patient The patient associated with the appointment.
     * @param doctor The doctor associated with the appointment.
     */
    public Appointment(int id, LocalDateTime dateTime, Patient patient, Doctor doctor) {
        this.id = id;
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
    }

    /**
     * Returns the unique identifier for the appointment.
     * @return The unique identifier for the appointment.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the date and time of the appointment.
     * @return The date and time of the appointment.
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Returns the patient associated with the appointment.
     * @return The patient associated with the appointment.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Returns the doctor associated with the appointment.
     * @return The doctor associated with the appointment.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Sets the unique identifier for the appointment.
     * @param id The unique identifier for the appointment.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the date and time of the appointment.
     * @param dateTime The date and time of the appointment.
     */
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    
    /**
     * Sets the date and time of the appointment using a String representation.
     * @param dateTime The date and time of the appointment as a String.
     */
    public void setDateTime(String dateTime) {
        this.dateTime = LocalDateTime.parse(dateTime);
    }

    /**
     * Sets the patient associated with the appointment.
     * @param patient The patient associated with the appointment.
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Sets the doctor associated with the appointment.
     * @param doctor The doctor associated with the appointment.
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
