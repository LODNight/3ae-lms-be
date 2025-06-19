package com.lms._ae.service.impl;

import com.lms._ae.models.Course;
import com.lms._ae.repository.CourseRepository;
import com.lms._ae.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
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
            existing.setCreatedBy(course.getCreatedBy() == null ? existing.getCreatedBy() : course.getCreatedBy());
            existing.setCreatedAt(course.getCreatedAt() == null ? existing.getCreatedAt() : course.getCreatedAt());
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
