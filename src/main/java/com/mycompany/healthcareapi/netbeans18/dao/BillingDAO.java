/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

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
        
        billings.add(billing1);
        billings.add(billing2);
    }
    
    public void createBilling(Billing billing){
        billings.add(billing);
    }
    
    public List<Billing> getBillings(){
        return billings;
    }
    
    public Billing getBilling(int id) {
        for (Billing billing : billings) {
            if (billing.getId() == id) {
                return billing;
            }
        }
        return null;
    }
    
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
