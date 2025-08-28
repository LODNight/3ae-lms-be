package com.lms._ae.modules.course.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String shortName;

    private String courseName;

    private String fieldId;

    private String description;

    private String createdBy;

    private String updatedBy;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


}
