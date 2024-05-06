/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapi.netbeans18.dao;

import com.mycompany.healthcareapi.netbeans18.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THISAL
 */
public class PersonDAO {
    private static List<Person> persons = new ArrayList<>();
    
    public List<Person> getAllPersons(){
        return persons;
    }
    
    public Person getPerson(int id){
        for(Person person : persons){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }
    
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
    
    public void deletePerson(int id){
        for(Person p : persons){
            if(p.getId() == id){
                persons.remove(p);
                break;
            }
        }
    }
}
