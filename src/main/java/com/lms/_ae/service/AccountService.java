package com.lms._ae.service;

import com.lms._ae.admin.dto.AccountDTO;

import java.util.List;

public interface AccountService {
    AccountDTO create(AccountDTO dto);
    AccountDTO update(int id, AccountDTO dto);
    AccountDTO getById(int id);
    String delete(int id);
    List<AccountDTO> getAll();

}
