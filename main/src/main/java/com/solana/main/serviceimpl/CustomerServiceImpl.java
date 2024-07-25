package com.solana.main.serviceimpl;

import com.solana.main.dao.CustomerDAO;
import com.solana.main.dto.CustomerDTO;
import com.solana.main.mapper.CustomerMapper;
import com.solana.main.model.Customer;
import com.solana.main.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDAO customerDAO;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO, CustomerMapper customerMapper) {
        this.customerDAO = customerDAO;
        this.customerMapper = CustomerMapper.INSTANCE;
    }

    @Override
    public List<CustomerDTO> getAllCustomerDTO() {
        List<Customer> listCustomer = customerDAO.findAll();
        return customerMapper.listCustomerToListCustomerDTO(listCustomer);
    }

    @Override
    public Optional<CustomerDTO> getCustomerDTOById(Long id) {
        Optional<Customer> customerOptional = customerDAO.findById(id);
        return customerOptional.map(customerMapper::customerToCustomerDTO);
    }

    @Override
    public CustomerDTO saveCustomerDTO(CustomerDTO customerDTO) {
        Customer customer = customerMapper.customerDTOToCustomer(customerDTO);
        Customer savedCustomer = customerDAO.save(customer);
        return customerMapper.customerToCustomerDTO(savedCustomer);
    }

    @Override
    public void deleteCustomer(Long id) {
        if (customerDAO.existsById(id)) {
            customerDAO.deleteById(id);
        } else {
            System.out.println("Lỗi Delete");
        }
    }
}
