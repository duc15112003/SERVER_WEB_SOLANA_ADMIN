package com.solana.main.controller;

import com.solana.main.dto.CustomerDTO;
import com.solana.main.serviceimpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @GetMapping
    public List<CustomerDTO> getAllProducts() {
        return customerServiceImpl.getAllCustomerDTO();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id) {
        return customerServiceImpl.getCustomerDTOById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CustomerDTO createProduct(@RequestBody CustomerDTO customerDTO) {
        return customerServiceImpl.saveCustomerDTO(customerDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> updateCustomerDTO(@PathVariable Long id, @RequestBody CustomerDTO customerDTO) {
        return customerServiceImpl.getCustomerDTOById(id)
                .map(existingCustomerDTO -> {
                    existingCustomerDTO.setId(customerDTO.getId());
                    existingCustomerDTO.setFirstname(customerDTO.getFirstname());
                    existingCustomerDTO.setLastname(customerDTO.getLastname());
                    existingCustomerDTO.setAvatar(customerDTO.getAvatar());
                    existingCustomerDTO.setBirthday(customerDTO.getBirthday());
                    existingCustomerDTO.setAddress(customerDTO.getAddress());
                    existingCustomerDTO.setPhoneNumber(customerDTO.getPhoneNumber());
                    existingCustomerDTO.setPublicKey(customerDTO.getPublicKey());
                    existingCustomerDTO.setCreateAt(customerDTO.getCreateAt());
                    CustomerDTO updatedProduct = customerServiceImpl.saveCustomerDTO(existingCustomerDTO);
                    return ResponseEntity.ok(updatedProduct);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerDTO(@PathVariable Long id) {
        if (customerServiceImpl.getCustomerDTOById(id).isPresent()) {
            customerServiceImpl.deleteCustomer(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
