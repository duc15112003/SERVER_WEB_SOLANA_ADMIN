package com.solana.main.serviceimpl;

import com.solana.main.dao.AccountDAO;
import com.solana.main.dto.AccountDTO;
import com.solana.main.dto.FeedbackDTO;
import com.solana.main.mapper.AccountMapper;
import com.solana.main.model.Account;
import com.solana.main.model.Customer;
import com.solana.main.model.Feedback;
import com.solana.main.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountDAO accountDAO;
    private final AccountMapper accountMapper;

    @Autowired
    public AccountServiceImpl(AccountDAO accountDAO, AccountMapper accountMapper) {
        this.accountDAO = accountDAO;
        this.accountMapper = accountMapper;
    }

    @Override
    public List<AccountDTO> getAllAccountDTO() {
        return accountMapper.listAccountToListAccountDTO(accountDAO.findAll());
    }

    @Override
    public Optional<AccountDTO> getAccountDTOById(Long id) {
        Optional<Account> account = accountDAO.findById(id);
        if (account.isPresent()) {
            return Optional.ofNullable(accountMapper.accountToAccountDTO(account.get()));
        } else {
            return null;
        }
    }

    @Override
    public AccountDTO saveAccountDTO(AccountDTO AccountDTO) {
        Account account = accountMapper.accountDTOToAccount(AccountDTO);
        Account savedAccount = accountDAO.save(account);
        return accountMapper.accountToAccountDTO(savedAccount);
    }

    @Override
    public void deleteAccount(Long id) {
        if (accountDAO.existsById(id)) {
            accountDAO.deleteById(id);
        } else {
            System.out.println("Lỗi Delete");
        }
    }
}
