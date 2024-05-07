/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.resources;

import com.mycompany.healthcareapi.netbeans18.dao.PersonDAO;
import com.mycompany.healthcareapi.netbeans18.model.Person;
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
// This class is responsible for handling HTTP requests related to 'Person' objects.
@Path("/persons")
public class PersonResource {
    // An instance of PersonDAO is created to interact with the database.
    private PersonDAO personDAO = new PersonDAO();

    // This method returns a list of all 'Person' objects when a GET request is made to '/persons'.
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPersons() {
        return personDAO.getAllPersons();
    }

    // This method returns a specific 'Person' object when a GET request is made to '/persons/{id}'.
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") int id) {
        return personDAO.getPerson(id);
    }

    // This method creates a new 'Person' object when a POST request is made to '/persons'.
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Person createPerson(Person person) {
        personDAO.createPerson(person);
        return person;
    }

    // This method updates a specific 'Person' object when a PUT request is made to '/persons/{id}'.
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Person updatePerson(@PathParam("id") int id, Person person) {
        personDAO.updatePerson(person);
        return person;
    }

    // This method deletes a specific 'Person' object when a DELETE request is made to '/persons/{id}'.
    @DELETE
    @Path("/{id}")
    public void deletePerson(@PathParam("id") int id) {
        personDAO.deletePerson(id);
    }
}

