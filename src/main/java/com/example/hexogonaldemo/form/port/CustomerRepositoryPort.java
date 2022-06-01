package com.example.hexogonaldemo.form.port;

import com.example.hexogonaldemo.form.model.Customer;

public interface CustomerRepositoryPort {
    Customer findCustomerById(Long id);
}
