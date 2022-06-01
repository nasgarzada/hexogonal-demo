package com.example.hexogonaldemo.form.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private PhoneNumber phone;
}
