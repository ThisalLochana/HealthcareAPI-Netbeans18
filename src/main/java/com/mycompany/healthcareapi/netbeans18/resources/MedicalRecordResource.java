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
@Path("/medicalRecords")
public class MedicalRecordResource {
    private MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAO();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordDAO.getAllMedicalRecords();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MedicalRecord getMedicalRecord(@PathParam("id") int id) {
        return medicalRecordDAO.getMedicalRecord(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordDAO.updateMedicalRecord(medicalRecord);
        return medicalRecord;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MedicalRecord updateMedicalRecord(@PathParam("id") int id, MedicalRecord medicalRecord) {
        medicalRecordDAO.updateMedicalRecord(medicalRecord);
        return medicalRecord;
    }

    @DELETE
    @Path("/{id}")
    public void deleteMedicalRecord(@PathParam("id") int id) {
        medicalRecordDAO.deleteMedicalRecord(id);
    }
}
