package com.lms._ae.modules.course.services;


import com.lms._ae.modules.course.entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseById(Integer id);
    Course createCourse(Course course);
    Course updateCourse(Integer id, Course course);
    void deleteCourse(Integer id);

}
