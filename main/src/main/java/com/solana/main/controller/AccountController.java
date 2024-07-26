package com.solana.main.controller;

import com.solana.main.dto.AccountDTO;
import com.solana.main.serviceimpl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountServiceImpl accountServiceImpl;

    @GetMapping
    public List<AccountDTO> getAllProducts() {
        return accountServiceImpl.getAllAccountDTO();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDTO> getCustomerById(@PathVariable Long id) {
        return accountServiceImpl.getAccountDTOById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AccountDTO createProduct(@RequestBody AccountDTO accountDTO) {
        return accountServiceImpl.saveAccountDTO(accountDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountDTO> updateAccountDTO(@PathVariable Long id, @RequestBody AccountDTO accountDTO) {
        return accountServiceImpl.getAccountDTOById(id)
                .map(existingAccountDTO -> {
                    existingAccountDTO.setUsername(accountDTO.getUsername());
                    existingAccountDTO.setPassword(accountDTO.getPassword());
                    existingAccountDTO.setStaff_id(accountDTO.getStaff_id());
                    existingAccountDTO.setUser_id(accountDTO.getUser_id());
                    AccountDTO updatedAccount = accountServiceImpl.saveAccountDTO(existingAccountDTO);
                    return ResponseEntity.ok(updatedAccount);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccountDTO(@PathVariable Long id) {
        if (accountServiceImpl.getAccountDTOById(id).isPresent()) {
            accountServiceImpl.deleteAccount(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
