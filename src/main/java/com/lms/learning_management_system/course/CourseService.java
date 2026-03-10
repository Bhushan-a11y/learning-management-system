package com.lms.learning_management_system.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
@Autowired
private CourseRepository cr;

public List<Course> getAllCourses() {
    List<Course> css = new ArrayList<>();
    for(Course c : cr.findAll()){
        css.add(c);
    }
    return css;
}

public void addCourse(Course course) {
   cr.save(course);
}

public List<Course> getCourseByInstructor(Long instructorId) {
    return cr.findByInstructorId(instructorId);




}
}
