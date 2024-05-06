/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class DoctorDAO {
    public static List<Doctor> doctors = new ArrayList<>();
    
    public void createDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    
    public List<Doctor> getAllDoctors(){
        return doctors;
    }
    
    public Doctor getDOctor(int id){
        for (Doctor doctor: doctors){
            if(doctor.getId() == id){
                return doctor;
            }
        }
        return null;
    }
    
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
    
    public void deleteDoctor(int id){
        Doctor doctorToRomove = null;
        for(Doctor doctor: doctors){
            if(doctor.getId() == id){
                doctorToRomove = doctor;
                break;
            }
        }
        if(doctorToRomove != null){
            doctors.remove(doctorToRomove);
        }
    }
}
