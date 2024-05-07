/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.exception.MedicalRecordNotFoundException;
import com.mycompany.healthcareapi.netbeans18.model.MedicalRecord;
import com.mycompany.healthcareapi.netbeans18.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class MedicalRecordDAO {
    private static List<MedicalRecord> medicalRecords = new ArrayList<>();
    
    static{
        // Dummy data for patients
        Patient patient1 = new Patient("Heart condition", "Stable", 101, "John Doe", "john.doe@example.com", "123 Main St");
        Patient patient2 = new Patient("Skin allergies", "Improving", 102, "Jane Smith", "jane.smith@example.com", "456 Oak St");
        
        PatientDAO patientDAO = new PatientDAO();

        // Creating two MedicalRecord objects
        MedicalRecord medicalRecord1 = new MedicalRecord(patient1, "Hypertension", "Prescription medication and lifestyle changes");
        MedicalRecord medicalRecord2 = new MedicalRecord(patient2, "Allergic dermatitis", "Topical corticosteroids and antihistamines");
        MedicalRecord medicalRecord3 = new MedicalRecord(patientDAO.getPatient(100), "Allergic dermatitis", "Topical corticosteroids and antihistamines");
        
        // Adding medical records to the list
        medicalRecords.add(medicalRecord1);
        medicalRecords.add(medicalRecord2);
        medicalRecords.add(medicalRecord3);
    }
    
    /**
     * Creates a new medical record.
     * @param medicalRecord The medical record to be created.
     */
    public void createMedicalRecord(MedicalRecord medicalRecord){
        medicalRecords.add(medicalRecord);
    }

    /**
     * Retrieves all medical records.
     * @return List of all medical records.
     */
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecords;
    }

    /**
     * Retrieves a medical record by patient ID.
     * @param id The ID of the patient associated with the medical record.
     * @return The medical record associated with the specified patient ID.
     * @throws MedicalRecordNotFoundException If the medical record associated with the specified patient ID is not found.
     */
    public MedicalRecord getMedicalRecord(int id) {
        for (MedicalRecord medicalRecord : medicalRecords) {
            if (medicalRecord.getPatient().getId() == id) {
                return medicalRecord;
            }
        }
        throw new MedicalRecordNotFoundException("MedicalRecord with ID " + id + " not found.");
    }

    /**
     * Updates an existing medical record.
     * @param medicalRecord The updated medical record.
     */
    public void updateMedicalRecord(MedicalRecord medicalRecord) {
        for (MedicalRecord m : medicalRecords) {
            if (m.getPatient().getId() == medicalRecord.getPatient().getId()) {
                m.setDiagnosis(medicalRecord.getDiagnosis());
                m.setTreatment(medicalRecord.getTreatment());
                break;
            }
        }
    }

    /**
     * Deletes a medical record by patient ID.
     * @param id The ID of the patient associated with the medical record to be deleted.
     */
    public void deleteMedicalRecord(int id) {
        MedicalRecord medicalRecordToRemove = null;
        for(MedicalRecord medicalRecord: medicalRecords){
            if(medicalRecord.getPatient().getId() == id){
                medicalRecordToRemove = medicalRecord;
                break;
            }
        }
        if(medicalRecordToRemove != null){
            medicalRecords.remove(medicalRecordToRemove);
        }
    }
}
