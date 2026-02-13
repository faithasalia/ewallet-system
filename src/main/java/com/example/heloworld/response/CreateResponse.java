package com.example.heloworld.response;

import com.example.heloworld.request.CreateRequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateResponse {
    public String responseCode;
    public String responseMessage;
    public CreateRequest dataRequest;
}
