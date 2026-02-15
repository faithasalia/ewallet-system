package com.example.heloworld.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeleteResponse {
    private String responseCode;
    private String responseMessage;
    private String deletedId;
}
