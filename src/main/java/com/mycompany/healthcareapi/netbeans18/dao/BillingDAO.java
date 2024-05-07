/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.exception.BillingNotFoundException;
import com.mycompany.healthcareapi.netbeans18.model.Billing;
import com.mycompany.healthcareapi.netbeans18.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class BillingDAO {
    private static List<Billing> billings = new ArrayList<>();
    
    static{
        // Dummy data for patients
        Patient patient6 = new Patient("Heart condition", "Stable", 101, "John Doe", "john.doe@example.com", "123 Main St");
        Patient patient7 = new Patient("Skin allergies", "Improving", 102, "Jane Smith", "jane.smith@example.com", "456 Oak St");

        // Creating two Billing objects with dummy data
        Billing billing1 = new Billing(1, patient6, 150.0, false);
        Billing billing2 = new Billing(2, patient7, 200.0, true);
        
        // Adding dummy billings to the list
        billings.add(billing1);
        billings.add(billing2);
    }
    
    /**
     * Creates a new billing record.
     * @param billing The billing record to be created.
     */
    public void createBilling(Billing billing){
        billings.add(billing);
    }
    
    /**
     * Retrieves all billing records.
     * @return List of all billing records.
     */
    public List<Billing> getBillings(){
        return billings;
    }
    
    /**
     * Retrieves a billing record by ID.
     * @param id The ID of the billing record to retrieve.
     * @return The billing record with the specified ID.
     * @throws BillingNotFoundException If the billing record with the specified ID is not found.
     */
    public Billing getBilling(int id) {
        for (Billing billing : billings) {
            if (billing.getId() == id) {
                return billing;
            }
        }
        throw new BillingNotFoundException("Billing with ID " + id + " not found.");
    }
    
    /**
     * Updates an existing billing record.
     * @param billing The updated billing record.
     */
    public void updateBilling(Billing billing) {
        for (Billing b : billings) {
            if (b.getId() == billing.getId()) {
                b.setPatient(billing.getPatient());
                b.setAmount(billing.getAmount());
                b.setPaid(billing.isPaid());
                break;
            }
        }
    }
    
    /**
     * Deletes a billing record by ID.
     * @param id The ID of the billing record to be deleted.
     */
    public void deleteBilling(int id){
        Billing billingToRemove = null;
        for(Billing billing: billings){
            if(billing.getId() == id){
                billingToRemove = billing;
                break;
            }
        }
        if(billingToRemove != null){
            billings.remove(billingToRemove);
        }
    }

}
