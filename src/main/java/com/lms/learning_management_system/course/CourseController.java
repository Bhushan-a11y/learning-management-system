package com.lms.learning_management_system.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lms.learning_management_system.Instructor.Instructor;

@RestController
public class CourseController {
@Autowired
private CourseService cs;
@RequestMapping(method=RequestMethod.GET,value="/instructor/courses")
public List<Course> getAllCourses(){
    return cs.getAllCourses();

}
@RequestMapping(method=RequestMethod.POST,value="/instructor/{instructorId}/courses")
public void addCourse(@RequestBody Course course,@PathVariable Long instructorId){
    course.setInstructor(new Instructor(instructorId,"",""));
    cs.addCourse(course);
}
@RequestMapping(method=RequestMethod.GET,value="/instructor/{instructorId}/courses")
public List<Course> getCourseByInstructor(@PathVariable Long instructorId){
    return cs.getCourseByInstructor(instructorId);

}
}

