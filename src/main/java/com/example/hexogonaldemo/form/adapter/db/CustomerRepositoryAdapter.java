package com.example.hexogonaldemo.form.adapter.db;

import com.example.hexogonaldemo.form.adapter.db.model.CustomerJpaRepository;
import com.example.hexogonaldemo.form.model.Customer;
import com.example.hexogonaldemo.form.port.CustomerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerRepositoryAdapter implements CustomerRepositoryPort {
    private final CustomerJpaRepository customerJpaRepository;

    @Override
    public Customer findCustomerById(Long id) {
        return customerJpaRepository.findById(id)
                .map(customerEntity ->  new Customer(customerEntity.getId(), customerEntity.getName()))
                .orElseThrow();
    }
}
