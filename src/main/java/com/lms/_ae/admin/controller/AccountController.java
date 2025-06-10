package com.lms._ae.admin.controller;

import com.lms._ae.admin.dto.AccountDTO;
import com.lms._ae.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping({"id"})
    public ResponseEntity<AccountDTO> getByList(@PathVariable int id){
        return ResponseEntity.ok(accountService.getById(id));

    }
}
