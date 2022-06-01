package com.example.hexogonaldemo.form.adapter.cotnroller;

import com.example.hexogonaldemo.form.dto.CustomerDto;
import com.example.hexogonaldemo.form.port.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/customers/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long id){
        return ResponseEntity.ok(new CustomerDto(customerService.getCustomer(id)));
    }
}
