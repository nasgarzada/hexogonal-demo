package com.example.hexogonaldemo.form.dto;

import com.example.hexogonaldemo.form.model.Customer;
import lombok.Data;

@Data
public class CustomerDto {
    private String name;

    public CustomerDto(Customer customer) {
        this.name = customer.getName();
    }
}
