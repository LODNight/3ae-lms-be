package com.lms._ae.modules.course.repositories;

import com.lms._ae.modules.course.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
