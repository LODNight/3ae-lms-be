package com.lms._ae.modules.course.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "level")
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String shortName;

    private String levelName;

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
