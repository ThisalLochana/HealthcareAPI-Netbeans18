/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.model;

/**
 *
 * @author THISAL
 */
public class Doctor extends Person {
    private String specialization; // The area of specialization of the doctor
    
    /**
     * Default constructor for Doctor class.
     */
    public Doctor(){
        super();
    }

    /**
     * Constructs a Doctor object with specified attributes.
     * @param specialization The area of specialization of the doctor.
     * @param id The unique identifier for the doctor.
     * @param name The name of the doctor.
     * @param contactInformation The contact information of the doctor.
     * @param address The address of the doctor.
     */
    public Doctor(String specialization, int id, String name, String contactInformation, String address) {
        super(id, name, contactInformation, address);
        this.specialization = specialization;
    }

    /**
     * Returns the area of specialization of the doctor.
     * @return The area of specialization of the doctor.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the area of specialization of the doctor.
     * @param specialization The area of specialization of the doctor.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
