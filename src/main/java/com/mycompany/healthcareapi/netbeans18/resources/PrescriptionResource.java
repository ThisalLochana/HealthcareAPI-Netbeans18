/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import com.mycompany.healthcareapi.netbeans18.dao.PrescriptionDAO;
import com.mycompany.healthcareapi.netbeans18.model.Prescription;
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
 * RESTful resource for managing prescription data.
 */
@Path("/prescriptions")
public class PrescriptionResource {
    private PrescriptionDAO prescriptionDAO = new PrescriptionDAO();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prescription> getAllPrescriptions() {
        return prescriptionDAO.getAllPrescriptions();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Prescription getPrescription(@PathParam("id") int id) {
        return prescriptionDAO.getPrescription(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Prescription createPrescription(Prescription prescription) {
        prescriptionDAO.createPrescription(prescription);
        return prescription;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Prescription updatePrescription(@PathParam("id") int id, Prescription prescription) {
        prescriptionDAO.updatePrescription(prescription);
        return prescription;
    }

    @DELETE
    @Path("/{id}")
    public void deletePrescription(@PathParam("id") int id) {
        prescriptionDAO.deletePrescription(id);
    }
}
