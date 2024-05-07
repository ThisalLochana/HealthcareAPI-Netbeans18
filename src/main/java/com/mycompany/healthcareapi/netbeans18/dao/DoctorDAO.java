/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.exception.DoctorNotFoundException;
import com.mycompany.healthcareapi.netbeans18.model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class DoctorDAO {
    public static List<Doctor> doctors = new ArrayList<>();
    
    static{
        // Sample doctor data
        Doctor doctor1 = new Doctor("Cardiologist",200,"Dr. Roshan Ranil Gunarathna", "08234923483", "Moratuwa, Sri Lanka");
        Doctor doctor2 = new Doctor("Neurologist",201,"Dr. Ajanthan Sivalingam", "08234923483", "Colombo, Sri Lanka");
        
        // Adding sample doctors to the list
        doctors.add(doctor1);
        doctors.add(doctor2);
    }
    
    /**
     * Creates a new doctor.
     * @param doctor The doctor to be created.
     */
    public void createDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    
    /**
     * Retrieves all doctors.
     * @return List of all doctors.
     */
    public List<Doctor> getAllDoctors(){
        return doctors;
    }
    
    /**
     * Retrieves a doctor by ID.
     * @param id The ID of the doctor to retrieve.
     * @return The doctor with the specified ID.
     * @throws DoctorNotFoundException If the doctor with the specified ID is not found.
     */
    public Doctor getDoctor(int id){
        for (Doctor doctor: doctors){
            if(doctor.getId() == id){
                return doctor;
            }
        }
        throw new DoctorNotFoundException("Doctor with ID " + id + " not found.");
    }
    
    /**
     * Updates an existing doctor.
     * @param doctor The updated doctor.
     */
    public void updateDoctor(Doctor doctor){
        for(Doctor d: doctors){
            if(d.getId() == doctor.getId()){
                d.setName(doctor.getName());
                d.setContactInformation(doctor.getContactInformation());
                d.setAddress(doctor.getAddress());
                d.setSpecialization(doctor.getSpecialization());
                break;
            }
        }
    }
    
    /**
     * Deletes a doctor by ID.
     * @param id The ID of the doctor to be deleted.
     */
    public void deleteDoctor(int id){
        Doctor doctorToRemove = null;
        for(Doctor doctor: doctors){
            if(doctor.getId() == id){
                doctorToRemove = doctor;
                break;
            }
        }
        if(doctorToRemove != null){
            doctors.remove(doctorToRemove);
        }
    }
}
