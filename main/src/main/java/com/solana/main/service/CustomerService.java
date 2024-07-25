package com.solana.main.service;

import com.solana.main.dao.CustomerDAO;
import com.solana.main.dto.CustomerDTO;
import com.solana.main.mapper.CustomerMapper;
import com.solana.main.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public List<CustomerDTO> getAllCustomerDTO();
    public Optional<CustomerDTO> getCustomerDTOById(Long id);
    public CustomerDTO saveCustomerDTO(CustomerDTO customerDTO);
    public void deleteCustomer(Long id);
}
