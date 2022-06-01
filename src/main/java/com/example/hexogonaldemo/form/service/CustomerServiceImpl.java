package com.example.hexogonaldemo.form.service;

import com.example.hexogonaldemo.form.model.Customer;
import com.example.hexogonaldemo.form.port.CustomerRepositoryPort;
import com.example.hexogonaldemo.form.port.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepositoryPort customerRepository;

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findCustomerById(id);
    }
}
