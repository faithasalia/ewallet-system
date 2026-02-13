package com.example.heloworld.response;


import com.example.heloworld.request.ReadRequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReadResponse {
    public String responseCode;
    public String responseMessage;
    public ReadRequest dataRequest;
}
