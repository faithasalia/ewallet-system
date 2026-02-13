package com.example.heloworld.request;

import com.example.heloworld.dto.Address;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateRequest {
    public String username;
    public String email;
    public String password;
    public Integer age;
    public Address address;
}
