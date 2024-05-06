/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.model.Appointment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class AppointmentDAO {
    private static List<Appointment> appointments= new ArrayList<>();
    
    public void createAppointment(Appointment appointment){
        appointments.add(appointment);
    }
    
    public List<Appointment> getAllAppointments(){
        return appointments;
    }
    
    public Appointment getAppointment(int id){
        for(Appointment appointment: appointments){
            if(appointment.getId() == id){
                return appointment;
            }
        }
        return null;
    }
    
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
