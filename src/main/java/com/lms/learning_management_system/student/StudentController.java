package com.lms.learning_management_system.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService ss;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return ss.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Student  getStudentById(@PathVariable Long id){
        return ss.getStudentById(id);
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
         ss.addStudent(student);
    }

}
