package com.lms._ae.modules.student.payload.student;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class DtoRequestStudent {

    @NotBlank(message = "firstName must not be blank")
    private String firstName;

    @NotBlank(message = "lastName must not be blank")
    private String lastName;

    @NotBlank(message = "student Date of birth must not be blank")
    private String studentDoB;

    private Boolean gender;

    private String email;
    private String imageURL;
    private String address;
    private String status;
    private LocalDate admissionDate;
    private String nationality;
}
