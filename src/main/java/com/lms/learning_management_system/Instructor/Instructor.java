package com.lms.learning_management_system.Instructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Instructor {
    @Id
    private long id;
    private String name;
    private String email;
    public Instructor(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public Instructor(){

    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    

}
