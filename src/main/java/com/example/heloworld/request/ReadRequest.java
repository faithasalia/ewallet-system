package com.example.heloworld.request;

import com.example.heloworld.dto.ReadAddress;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReadRequest {
    public String username = "Faithza";
    public String email = "faithza@gmail";
    public String password = "faith123";
    public Integer age = 21;
    public ReadAddress address;
}
