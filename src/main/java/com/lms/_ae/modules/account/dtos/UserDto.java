package com.lms._ae.modules.account.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {
    private int id;
    private String username;
    private String email;
}
