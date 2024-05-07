/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.exception.PersonNotFoundException;
import com.mycompany.healthcareapi.netbeans18.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class PersonDAO {
    private static List<Person> persons = new ArrayList<>();
    
    /**
     * Creates a new person.
     * @param person The person to be created.
     */
    public void createPerson(Person person){
        persons.add(person);
    }
    
    /**
     * Retrieves all persons.
     * @return List of all persons.
     */
    public List<Person> getAllPersons(){
        return persons;
    }
    
    /**
     * Retrieves a person by ID.
     * @param id The ID of the person to retrieve.
     * @return The person with the specified ID.
     * @throws PersonNotFoundException If the person with the specified ID is not found.
     */
    public Person getPerson(int id){
        for(Person person : persons){
            if(person.getId() == id){
                return person;
            }
        }
        throw new PersonNotFoundException("Person with ID " + id + " not found.");
    }
    
    /**
     * Updates an existing person.
     * @param person The updated person.
     */
    public void updatePerson(Person person){
        for(Person p : persons){
            if(p.getId() == person.getId()){
                p.setName(person.getName());
                p.setContactInformation(person.getContactInformation());
                p.setAddress(person.getAddress());
                break;
            }
        }
    }
    
    /**
     * Deletes a person by ID.
     * @param id The ID of the person to be deleted.
     */
    public void deletePerson(int id){
        for(Person p : persons){
            if(p.getId() == id){
                persons.remove(p);
                break;
            }
        }
    }
}
