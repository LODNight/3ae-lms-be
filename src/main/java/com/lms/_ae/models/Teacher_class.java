package com.lms._ae.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "teacher_class")
@Data
public class Teacher_class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String teacherId;
    private String classId;
    private String teachingTypeId;

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
