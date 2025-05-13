package com.lms._ae.admin.controller;

import com.lms._ae.dto.request.UserRequestDTO;
import com.lms._ae.dto.response.ResponseData;
import com.lms._ae.dto.response.ResponseError;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
@Validated
public class AdminUserController {

    @PostMapping("/")
    public ResponseData<Integer> addUsser(@Valid @RequestBody UserRequestDTO user){
        return new ResponseError(HttpStatus.BAD_REQUEST.value(), "Can not add User");
    }

    @GetMapping("/findAll")
    public ResponseData<List<UserRequestDTO>> getAllUsser(@Valid @RequestBody UserRequestDTO user){
        return new ResponseData<>(HttpStatus.BAD_REQUEST.value(),
                "Can not add User",
                List.of(new UserRequestDTO(1,"Tay", "Java", "admin@tayjava.vn", "0123456789")));
    }

}
