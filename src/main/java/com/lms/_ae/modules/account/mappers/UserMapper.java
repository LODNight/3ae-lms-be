package com.lms._ae.modules.account.mappers;

import com.lms._ae.modules.account.dtos.UserDto;
import com.lms._ae.modules.account.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}

