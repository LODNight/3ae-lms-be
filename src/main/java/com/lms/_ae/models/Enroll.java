package com.lms._ae.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "enroll")
@Data
public class Enroll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String studentId;
    private String classId;
    private String admissionDate;

    private String description;
    private String status;

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
