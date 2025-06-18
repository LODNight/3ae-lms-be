package com.lms._ae.controller;

import com.lms._ae.models.Course;
import com.lms._ae.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Integer id){
        return courseService.getCourseById(id);
    }

    @PostMapping("/add")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @PutMapping("/update/{id}")
    public Course updateCourse(@PathVariable Integer id, @RequestBody Course course){
        return courseService.updateCourse(id,course);
    }

    @DeleteMapping("delete/{id}")
    public void deleteCourse(@PathVariable Integer id){
        courseService.deleteCourse(id);
    }

}
