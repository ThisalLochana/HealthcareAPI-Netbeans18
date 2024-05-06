/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.model.Billing;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class BillingDAO {
    private List<Billing> billings = new ArrayList<>();
    
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
