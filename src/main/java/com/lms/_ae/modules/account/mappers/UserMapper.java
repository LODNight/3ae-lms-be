package com.lms._ae.modules.account.mappers;

import com.lms._ae.modules.account.dtos.UserDto;
import com.lms._ae.modules.account.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
//    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);
}