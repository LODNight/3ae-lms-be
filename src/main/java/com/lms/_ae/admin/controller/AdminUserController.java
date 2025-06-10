package com.lms._ae.admin.controller;

import com.lms._ae.admin.dto.request.UserRequestDTO;
import com.lms._ae.admin.dto.response.ResponseData;
import com.lms._ae.admin.dto.response.ResponseError;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/user")
@Validated
public class AdminUserController {

    @PostMapping("/")
    public ResponseData<Integer> addUsser(@Valid @RequestBody UserRequestDTO user){
        return new ResponseError(HttpStatus.BAD_REQUEST.value(), "Can not add User");
    }
    

}
