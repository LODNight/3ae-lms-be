package com.lms._ae.modules.student.repositories;

import com.lms._ae.modules.student.entities.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollRepository extends JpaRepository<Enroll, Long> {
}
