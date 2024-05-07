/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import com.mycompany.healthcareapi.netbeans18.dao.AppointmentDAO;
import com.mycompany.healthcareapi.netbeans18.model.Appointment;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author THISAL
 */
/**
 * RESTful resource for managing Appointments.
 */
@Path("/appointments")
public class AppointmentResource {
    private AppointmentDAO appointmentDAO = new AppointmentDAO();
    
    /**
     * Retrieves all appointments.
     * @return List of all appointments.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAllAppointments(){
        return appointmentDAO.getAllAppointments();
    }
    
    /**
     * Retrieves an appointment by ID.
     * @param id The ID of the appointment to retrieve.
     * @return The appointment with the specified ID.
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Appointment getAppointment(@PathParam("id") int id){
        return appointmentDAO.getAppointment(id);
    }
    
    /**
     * Creates a new appointment.
     * @param appointment The appointment to be created.
     * @return The created appointment.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Appointment createAppointment(Appointment appointment){
        appointmentDAO.createAppointment(appointment);
        return appointment;
    }
    
    /**
     * Updates an existing appointment.
     * @param id The ID of the appointment to update.
     * @param appointment The updated appointment.
     * @return The updated appointment.
     */
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Appointment updateAppointment(@PathParam("id") int id, Appointment appointment){
        appointmentDAO.updateAppointment(appointment);
        return appointment;
    }
    
    /**
     * Deletes an appointment by ID.
     * @param id The ID of the appointment to delete.
     */
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteAppointment(@PathParam("id") int id){
        appointmentDAO.deleteAppointment(id);
    }
}
