/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.exception;

/**
 *
 * @author THISAL
 */
public class PrescriptionNotFoundException extends RuntimeException {
    public PrescriptionNotFoundException(String message) {
        super(message);
    }
}