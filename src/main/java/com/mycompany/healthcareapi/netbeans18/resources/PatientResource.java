/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import com.mycompany.healthcareapi.netbeans18.dao.PatientDAO;
import com.mycompany.healthcareapi.netbeans18.model.Patient;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author THISAL
 */
@Path("/patients")
public class PatientResource {
    private PatientDAO patientDAO = new PatientDAO();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Patient> getAllPatients(){
        return patientDAO.getAllPatients();
    }
    
    @GET
    @Path("/{id}")
    @Produces (MediaType.APPLICATION_JSON)
    public Patient getPatient(@PathParam("id") int id){
        return patientDAO.getPatient(id);
    }
    
    @POST
    @Produces (MediaType.APPLICATION_JSON)
    public Patient createpatient(Patient patient){
        patientDAO.createPatient(patient);
        return patient;
    }
    
    
    @DELETE
    @Path("/{id}")
    @Produces (MediaType.APPLICATION_JSON)
    public void deletePatient(@PathParam("id")int id){
        patientDAO.deletePatient(id);
    }
}
