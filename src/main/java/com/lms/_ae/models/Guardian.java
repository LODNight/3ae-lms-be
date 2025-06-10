package com.lms._ae.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "guardian")
@Data
public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String parentFirstName;
    private String parentLastName;

//    Số căn cước công dân
    private String parentIdNumber;

//    Maybe have greater than one
    private String email;
//    Only get year
    private String dob;
//    Male/Female/Other
    private String gender;
    private String district;
    private String ward;
    private String city;
    private String nationality;


    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
