package com.solana.main.service;

import com.solana.main.dto.AccountDTO;
import com.solana.main.dto.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    public List<AccountDTO> getAllAccountDTO();
    public Optional<AccountDTO> getAccountDTOById(Long id);
    public AccountDTO saveAccountDTO(AccountDTO AccountDTO);
    public void deleteAccount(Long id);
}
