/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import com.mycompany.healthcareapi.netbeans18.dao.MedicalRecordDAO;
import com.mycompany.healthcareapi.netbeans18.model.MedicalRecord;
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
 * RESTful resource for managing Medical Records.
 */
@Path("/medicalRecords")
public class MedicalRecordResource {
    private MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAO();

    /**
     * Retrieves all medical records.
     * @return List of all medical records.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordDAO.getAllMedicalRecords();
    }

    /**
     * Retrieves a medical record by ID.
     * @param id The ID of the medical record to retrieve.
     * @return The medical record with the specified ID.
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MedicalRecord getMedicalRecord(@PathParam("id") int id) {
        return medicalRecordDAO.getMedicalRecord(id);
    }

    /**
     * Creates a new medical record.
     * @param medicalRecord The medical record to be created.
     * @return The created medical record.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordDAO.createMedicalRecord(medicalRecord);
        return medicalRecord;
    }

    /**
     * Updates an existing medical record.
     * @param id The ID of the medical record to update.
     * @param medicalRecord The updated medical record.
     * @return The updated medical record.
     */
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MedicalRecord updateMedicalRecord(@PathParam("id") int id, MedicalRecord medicalRecord) {
        medicalRecordDAO.updateMedicalRecord(medicalRecord);
        return medicalRecord;
    }

    /**
     * Deletes a medical record by ID.
     * @param id The ID of the medical record to delete.
     */
    @DELETE
    @Path("/{id}")
    public void deleteMedicalRecord(@PathParam("id") int id) {
        medicalRecordDAO.deleteMedicalRecord(id);
    }
}
