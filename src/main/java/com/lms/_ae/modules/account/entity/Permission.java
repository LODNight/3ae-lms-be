package com.lms._ae.modules.account.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;

@Entity
@Table(name = "permissons")
@Data
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String createdBy;

    private String updatedBy;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
