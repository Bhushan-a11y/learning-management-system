package com.lms.learning_management_system.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository sr;

    public List<Student> getAllStudents() {
        List<Student> ls = new ArrayList<>();
        for(Student s : sr.findAll()){
            ls.add(s);

        }
        return ls;
    }

    public Student  getStudentById(Long id) {
       return sr.findById(id).orElse(null);
    }

    public void addStudent(Student student) {
        sr.save(student);
    }

   

}
