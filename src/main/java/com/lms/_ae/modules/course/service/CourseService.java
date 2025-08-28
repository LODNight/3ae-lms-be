package com.lms._ae.modules.course.service;


import com.lms._ae.modules.course.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseById(Integer id);
    Course createCourse(Course course);
    Course updateCourse(Integer id, Course course);
    void deleteCourse(Integer id);

}
