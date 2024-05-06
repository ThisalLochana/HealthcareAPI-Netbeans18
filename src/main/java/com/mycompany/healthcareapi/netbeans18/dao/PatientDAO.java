/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class PatientDAO {
    private static List<Patient> patients = new ArrayList<>();
    
    public List<Patient> getAllPatients(){
        return patients;
    }
    
    public void createPatient(Patient patient){
        patients.add(patient);
    }
    
    public Patient getPatient(int id){
        for(Patient patient : patients){
            if(patient.getId() == id){
                return patient;
            }
        }
        return null;
    }
    
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
