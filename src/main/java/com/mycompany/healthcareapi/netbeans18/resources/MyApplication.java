/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author THISAL
 */
@ApplicationPath("rest")
public class MyApplication extends Application{
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> classes = new HashSet<>();
        classes.add(PatientResource.class);
        classes.add(DoctorResource.class);
        classes.add(AppointmentResource.class);
        classes.add(MedicalRecordResource.class);
        classes.add(PrescriptionResource.class);
        classes.add(BillingResource.class);
        return classes;
    }
}
