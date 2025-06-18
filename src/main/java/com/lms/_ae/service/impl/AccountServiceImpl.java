package com.lms._ae.service.impl;

import com.lms._ae.admin.dto.AccountDTO;
import com.lms._ae.admin.model.Account;
import com.lms._ae.admin.repository.AccountRepository;
import com.lms._ae.service.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private final AccountRepository repo;

    public AccountServiceImpl(AccountRepository repo) {
        this.repo = repo;
    }

    private AccountDTO toDTO(Account entity) {
        AccountDTO dto = new AccountDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    private Account toEntity(AccountDTO dto) {
        Account entity = new Account();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public AccountDTO create(AccountDTO dto) {
        return toDTO(repo.save(toEntity(dto)));
    }

    @Override
    public AccountDTO update(int id, AccountDTO dto) {
        return null;
    }

    @Override
    public AccountDTO getById(int id) {
        return null;
    }

    @Override
    public String delete(int id) {
        return "";
    }

    @Override
    public List<AccountDTO> getAll() {
        return null;
    }
}
