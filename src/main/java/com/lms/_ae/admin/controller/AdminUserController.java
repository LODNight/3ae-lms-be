package com.lms._ae.admin.controller;

import com.lms._ae.dto.request.UserRequestDTO;
import com.lms._ae.dto.response.ResponseData;
import com.lms._ae.dto.response.ResponseError;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/user")
@Validated
public class AdminUserController {

    @PostMapping("/")
    public ResponseData<Integer> addUsser(@Valid @RequestBody UserRequestDTO user){
        return new ResponseError(HttpStatus.BAD_REQUEST.value(), "Can not add User");
    }

}
