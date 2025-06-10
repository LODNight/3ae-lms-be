package com.lms._ae.admin.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "account")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    private String password;


}
