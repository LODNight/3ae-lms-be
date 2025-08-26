package com.lms._ae.modules.account.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "account_roles")
@Data
public class AccountRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int accountId;

    private int roleId;
}
