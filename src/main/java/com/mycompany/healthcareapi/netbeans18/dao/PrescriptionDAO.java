/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.exception.PrescriptionNotFoundException;
import com.mycompany.healthcareapi.netbeans18.model.Patient;
import com.mycompany.healthcareapi.netbeans18.model.Prescription;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class PrescriptionDAO {
    private static List<Prescription> prescriptions = new ArrayList<>();
    
    // Static block to initialize some sample prescription data
    static{
        // Dummy data for patients
        Patient patient1 = new Patient("Heart condition", "Stable", 101, "John Doe", "john.doe@example.com", "123 Main St");
        Patient patient2 = new Patient("Skin allergies", "Improving", 102, "Jane Smith", "jane.smith@example.com", "456 Oak St");

        // Creating two Prescription objects
        Prescription prescription1 = new Prescription(1, patient1, "Aspirin", "500mg", "Take one tablet daily with food");
        Prescription prescription2 = new Prescription(2, patient2, "Cetirizine", "10mg", "Take one tablet at bedtime");
        
        // Adding sample prescriptions to the list
        prescriptions.add(prescription1);
        prescriptions.add(prescription2);
    }

    /**
     * Creates a new prescription.
     * @param prescription The prescription to be created.
     */
    public void createPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }
    
    /**
     * Retrieves all prescriptions.
     * @return List of all prescriptions.
     */
    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    /**
     * Retrieves a prescription by ID.
     * @param id The ID of the prescription to retrieve.
     * @return The prescription with the specified ID.
     * @throws PrescriptionNotFoundException If the prescription with the specified ID is not found.
     */
    public Prescription getPrescription(int id) {
        for (Prescription prescription : prescriptions) {
            if (prescription.getId() == id) {
                return prescription;
            }
        }
        throw new PrescriptionNotFoundException("Prescription with ID " + id + " not found.");
    }

    /**
     * Updates an existing prescription.
     * @param prescription The updated prescription.
     */
    public void updatePrescription(Prescription prescription) {
        for (Prescription p : prescriptions) {
            if (p.getId() == prescription.getId()) {
                p.setPatient(prescription.getPatient());
                p.setMedication(prescription.getMedication());
                p.setDosage(prescription.getDosage());
                p.setInstructions(prescription.getInstructions());
                break;
            }
        }
    }

    /**
     * Deletes a prescription by ID.
     * @param id The ID of the prescription to be deleted.
     */
    public void deletePrescription(int id){
        Prescription prescriptionToRemove = null;
        for(Prescription prescription: prescriptions){
            if(prescription.getId() == id){
                prescriptionToRemove = prescription;
                break;
            }
        }
        if(prescriptionToRemove != null){
            prescriptions.remove(prescriptionToRemove);
        }
    }
}
