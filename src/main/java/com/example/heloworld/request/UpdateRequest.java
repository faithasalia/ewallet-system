package com.example.heloworld.request;

import com.example.heloworld.dto.Address;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateRequest {
    private String username;
    private String email;
    private String password;
    private Integer age;
    private Address address;
}
