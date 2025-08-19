package com.lms._ae.modules.course.repository;

import com.lms._ae.modules.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
