package com.lms.learning_management_system.course;

import com.lms.learning_management_system.Instructor.Instructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
     @Id
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    private Instructor instructor;
    public Course(){
        
    }
     public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
   

    
    }
   


