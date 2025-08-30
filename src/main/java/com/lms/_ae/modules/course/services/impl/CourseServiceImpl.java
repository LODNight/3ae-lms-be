package com.lms._ae.modules.course.services.impl;

import com.lms._ae.modules.course.entities.Course;
import com.lms._ae.modules.course.repositories.CourseRepository;
import com.lms._ae.modules.course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository repository;

    @Override
    public List<Course> getAllCourse() {
        return repository.findAll();
    }

    @Override
    public Course getCourseById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Course createCourse(Course course) {
        course.setCreatedAt(LocalDateTime.now());
        return repository.save(course);
    }

    @Override
    public Course updateCourse(Integer id, Course course) {
        Course existing = repository.findById(id).orElse(null);
        if(existing != null){
            existing.setCourseName(course.getCourseName());
            existing.setShortName(course.getShortName());
            existing.setFieldId(course.getFieldId());
            existing.setDescription(course.getDescription());

            // Created and Updated
            existing.setUpdatedAt(LocalDateTime.now());
            existing.setUpdatedBy(course.getUpdatedBy());

            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCourse(Integer id) {
        repository.deleteById(id);
    }
}
