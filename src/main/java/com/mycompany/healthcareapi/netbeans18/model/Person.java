/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.model;

/**
 *
 * @author THISAL
 */
public class Person {
    private int id; // The unique identifier for the person
    private String name; // The name of the person
    private String contactInformation; // The contact information of the person
    private String address; // The address of the person
    
    /**
     * Default constructor for Person class.
     */
    public Person(){
        
    }

    /**
     * Constructs a Person object with specified attributes.
     * @param id The unique identifier for the person.
     * @param name The name of the person.
     * @param contactInformation The contact information of the person.
     * @param address The address of the person.
     */
    public Person(int id, String name, String contactInformation, String address) {
        this.id = id;
        this.name = name;
        this.contactInformation = contactInformation;
        this.address = address;
    }

    /**
     * Returns the unique identifier for the person.
     * @return The unique identifier for the person.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the person.
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the contact information of the person.
     * @return The contact information of the person.
     */
    public String getContactInformation() {
        return contactInformation;
    }

    /**
     * Returns the address of the person.
     * @return The address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the unique identifier for the person.
     * @param id The unique identifier for the person.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the name of the person.
     * @param name The name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the contact information of the person.
     * @param contactInformation The contact information of the person.
     */
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    /**
     * Sets the address of the person.
     * @param address The address of the person.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
