package com.lms.learning_management_system.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface  CourseRepository extends CrudRepository<Course, Long> {
    public List<Course> findByInstructorId(Long instructorId);

}
