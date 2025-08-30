package com.lms._ae.modules.student.payload.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DtoStudent {

    private Long id;
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
}
