/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.exception.AppointmentNotFoundException;
import com.mycompany.healthcareapi.netbeans18.model.Appointment;
import com.mycompany.healthcareapi.netbeans18.model.Doctor;
import com.mycompany.healthcareapi.netbeans18.model.Patient;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class AppointmentDAO {
    private static List<Appointment> appointments = new ArrayList<>();
    
    static{
        // Sample patient and doctor data
        Patient patient3 = new Patient("Heart condition", "Stable", 101, "John Doe", "john.doe@example.com", "123 Main St");
        Patient patient4 = new Patient("Skin allergies", "Improving", 102, "Jane Smith", "jane.smith@example.com", "456 Oak St");

        Doctor doctor3 = new Doctor("Cardiology", 201, "Dr. Smith", "smith@example.com", "789 Elm St");
        Doctor doctor4 = new Doctor("Dermatology", 202, "Dr. Johnson", "johnson@example.com", "321 Pine St");
        
        DoctorDAO doctorDAO = new DoctorDAO();
        PatientDAO patientDAO = new PatientDAO();
        
        // Sample appointments
        Appointment appointment1 = new Appointment(1, LocalDateTime.of(2024, 5, 6, 10, 0), patient3, doctor3);
        Appointment appointment2 = new Appointment(2, LocalDateTime.of(2024, 5, 7, 14, 30), patient4, doctor4);
        Appointment appointment3 = new Appointment(3, LocalDateTime.of(2024, 5, 8, 11, 15), patient3, doctor4);
        Appointment appointment4 = new Appointment(4, LocalDateTime.of(2024, 6, 8, 8, 15), patientDAO.getPatient(100), doctorDAO.getDoctor(200));
        
        // Adding sample appointments to the list
        appointments.add(appointment1);
        appointments.add(appointment2);
        appointments.add(appointment3);
        appointments.add(appointment4);
    }
    
    /**
     * Creates a new appointment.
     * @param appointment The appointment to be created.
     */
    public void createAppointment(Appointment appointment){
        appointments.add(appointment);
    }
    
    /**
     * Retrieves all appointments.
     * @return List of all appointments.
     */
    public List<Appointment> getAllAppointments(){
        return appointments;
    }
    
    /**
     * Retrieves an appointment by ID.
     * @param id The ID of the appointment to retrieve.
     * @return The appointment with the specified ID.
     * @throws AppointmentNotFoundException If the appointment with the specified ID is not found.
     */
    public Appointment getAppointment(int id){
        for(Appointment appointment: appointments){
            if(appointment.getId() == id){
                return appointment;
            }
        }
        throw new AppointmentNotFoundException("Appointment with ID " + id + " not found.");
    }
    
    /**
     * Updates an existing appointment.
     * @param appointment The updated appointment.
     */
    public void updateAppointment(Appointment appointment){
        for(Appointment a: appointments){
            if(a.getId() == appointment.getId()){
                a.setDateTime(appointment.getDateTime());
                a.setDoctor(appointment.getDoctor());
                a.setPatient(appointment.getPatient());
                break;
            }
        }
    }
     
    /**
     * Deletes an appointment by ID.
     * @param id The ID of the appointment to be deleted.
     */
    public void deleteAppointment(int id){
        Appointment appointmentToRemove = null;
        for(Appointment appointment: appointments){
            if(appointment.getId() == id){
                appointmentToRemove = appointment;
                break;
            }
        }
        if(appointmentToRemove != null){
            appointments.remove(appointmentToRemove);
        }   
    }
}
