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
    private int id;
    private Patient patient;
    private double amount;
    private boolean paid;

    public Billing(int id, Patient patient, double amount, boolean paid) {
        this.id = id;
        this.patient = patient;
        this.amount = amount;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
