/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.exception;

/**
 *
 * @author THISAL
 */
public class AppointmentNotFoundException extends RuntimeException {
    
    /**
     * Constructs a new AppointmentNotFoundException with the specified detail message.
     * @param message the detail message (which is saved for later retrieval by the getMessage() method).
     */
    public AppointmentNotFoundException(String message) {
        super(message);
    }
}
