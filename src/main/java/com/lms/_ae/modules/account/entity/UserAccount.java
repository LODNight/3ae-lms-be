package com.lms._ae.modules.account.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "account_profiles")
@Data
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int accountId;

    private int profileId;

}
