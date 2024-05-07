/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.exception.PatientNotFoundException;
import com.mycompany.healthcareapi.netbeans18.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class PatientDAO {
    private static List<Patient> patients = new ArrayList<>();
    
    // Static block to initialize some sample patient data
    static{
        Patient patient1 = new Patient("Heart Condition","Stable", 100, "Thisal", "1234567890", "Colombo, Sri Lanka");
        Patient patient2 = new Patient("Asthma","Improving", 101, "Kasun", "1234567890", "Kandy, Sri Lanka");
    
        // Adding sample patients to the list
        patients.add(patient1);
        patients.add(patient2);
    }
    
    /**
     * Retrieves all patients.
     * @return List of all patients.
     */
    public List<Patient> getAllPatients(){
        return patients;
    }
    
    /**
     * Creates a new patient.
     * @param patient The patient to be created.
     */
    public void createPatient(Patient patient){
        patients.add(patient);
    }
    
    /**
     * Retrieves a patient by ID.
     * @param id The ID of the patient to retrieve.
     * @return The patient with the specified ID.
     * @throws PatientNotFoundException If the patient with the specified ID is not found.
     */
    public Patient getPatient(int id){
        for(Patient patient : patients){
            if(patient.getId() == id){
                return patient;
            }
        }
        throw new PatientNotFoundException("Patient with ID " + id + " not found.");
    }
    
    /**
     * Updates an existing patient.
     * @param patient The updated patient.
     */
    public void updatePatient(Patient patient){
        for(Patient p : patients){
            if(p.getId() == patient.getId()){
                p.setName(patient.getName());
                p.setContactInformation(patient.getContactInformation());
                p.setAddress(patient.getAddress());
                p.setMedicalHistory(patient.getMedicalHistory());
                p.setCurrentHealthStatus(patient.getCurrentHealthStatus());
                break;
            }
        }
    }
    
    /**
     * Deletes a patient by ID.
     * @param id The ID of the patient to be deleted.
     */
    public void deletePatient(int id){
        Patient patientToRemove = null;
        for(Patient p : patients){
            if(p.getId() == id){
                patientToRemove = p;
                break;
            }
        }
        if(patientToRemove != null){
            patients.remove(patientToRemove);
        }
    }
}
