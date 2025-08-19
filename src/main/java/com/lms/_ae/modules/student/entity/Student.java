package com.lms._ae.modules.student.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;

    private String studentDoB;
    private Boolean gender;
    private String email;
    private String imageURL;
    private String address;
    private String status;
    private LocalDate admissionDate;
    private String nationality;

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
