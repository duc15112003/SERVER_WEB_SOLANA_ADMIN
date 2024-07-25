package com.solana.main.mapper;

import com.solana.main.dto.CustomerDTO;
import com.solana.main.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );

    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDto);
    List<Customer> listCustomerDTOToListCustomer(List<CustomerDTO> listCustomerDTO);
    List<CustomerDTO> listCustomerToListCustomerDTO(List<Customer> listCustomer);
}
