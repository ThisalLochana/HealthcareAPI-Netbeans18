/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.model.MedicalRecord;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class MedicalRecordDAO {
    private static List<MedicalRecord> medicalRecords = new ArrayList<>();

    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecords;
    }

    public MedicalRecord getMedicalRecord(int id) {
        for (MedicalRecord medicalRecord : medicalRecords) {
            if (medicalRecord.getPatient().getId() == id) {
                return medicalRecord;
            }
        }
        return null;
    }

    public void updateMedicalRecord(MedicalRecord medicalRecord) {
        for (MedicalRecord m : medicalRecords) {
            if (m.getPatient().getId() == medicalRecord.getPatient().getId()) {
                m.setDiagnosis(medicalRecord.getDiagnosis());
                m.setTreatment(medicalRecord.getTreatment());
                break;
            }
        }
    }

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
