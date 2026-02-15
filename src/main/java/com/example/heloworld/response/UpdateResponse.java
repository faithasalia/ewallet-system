package com.example.heloworld.response;

import com.example.heloworld.request.UpdateRequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateResponse {
    public String responseCode;
    public String responseMessage;
    public UpdateRequest dataRequest;
}
