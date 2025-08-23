package com.lms._ae.modules.course.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "bases")
@Data
public class Base {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


//    Phân biệt giữa K12, K18, mầm non
    private String baseType;

//    Phân biệt giữa khối HO và khối thường
    private String baseLevel;

    private String baseName;
    private Double baseSize;

//    Tòa nhà chung cư, tòa nhà nguyên căn
    private String buildingType;

    private String otherShortName;
    private String shortName;
    private String baseCity;

    private String baseDistrict;
    private String baseWard;
    private String baseRoad;
    private String country;

    private String description;

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
