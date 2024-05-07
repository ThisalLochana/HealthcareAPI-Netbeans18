/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import com.mycompany.healthcareapi.netbeans18.dao.BillingDAO;
import com.mycompany.healthcareapi.netbeans18.model.Billing;
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
 * RESTful resource for managing Billings.
 */
@Path("/billings")
public class BillingResource {
    private BillingDAO billingDAO = new BillingDAO();

    /**
     * Retrieves all billings.
     * @return List of all billings.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Billing> getAllBillings() {
        return billingDAO.getBillings();
    }

    /**
     * Retrieves a billing by ID.
     * @param id The ID of the billing to retrieve.
     * @return The billing with the specified ID.
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Billing getBilling(@PathParam("id") int id) {
        return billingDAO.getBilling(id);
    }

    /**
     * Creates a new billing.
     * @param billing The billing to be created.
     * @return The created billing.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Billing createBilling(Billing billing) {
        billingDAO.createBilling(billing);
        return billing;
    }

    /**
     * Updates an existing billing.
     * @param id The ID of the billing to update.
     * @param billing The updated billing.
     * @return The updated billing.
     */
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Billing updateBilling(@PathParam("id") int id, Billing billing) {
        billingDAO.updateBilling(billing);
        return billing;
    }

    /**
     * Deletes a billing by ID.
     * @param id The ID of the billing to delete.
     */
    @DELETE
    @Path("/{id}")
    public void deleteBilling(@PathParam("id") int id) {
        billingDAO.deleteBilling(id);
    }
}
