/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.model.Prescription;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class PrescriptionDAO {
    private static List<Prescription> prescriptions = new ArrayList<>();

    public void createPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }
    
    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    public Prescription getPrescription(int id) {
        for (Prescription prescription : prescriptions) {
            if (prescription.getId() == id) {
                return prescription;
            }
        }
        return null;
    }

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
