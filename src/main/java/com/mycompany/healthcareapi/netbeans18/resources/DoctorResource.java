/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import com.mycompany.healthcareapi.netbeans18.dao.DoctorDAO;
import com.mycompany.healthcareapi.netbeans18.model.Doctor;
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
@Path("/doctors")
public class DoctorResource {
    private DoctorDAO doctorDAO = new DoctorDAO();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> getAllDoctors(){
        return doctorDAO.getAllDoctors();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Doctor getDoctor(@PathParam("id")int id){
        return doctorDAO.getDOctor(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Doctor createDoctor(Doctor doctor){
        doctorDAO.createDoctor(doctor);
        return doctor;
    }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Doctor updateDoctor(@PathParam("id")int id, Doctor doctor){
        doctorDAO.updateDoctor(doctor);
        return doctor;
    }
    
    @DELETE
    @Path("/{id}")
    @Produces (MediaType.APPLICATION_JSON)
    public void deleteDoctor(@PathParam("id")int id){
        doctorDAO.deleteDoctor(id);
    }
}
