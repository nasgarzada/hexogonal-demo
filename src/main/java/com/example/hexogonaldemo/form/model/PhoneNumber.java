package com.example.hexogonaldemo.form.model;

public class PhoneNumber {
    private String prefix;
    private String number;

    public String getPhone(){
        return this.prefix + this.number;
    }
}
