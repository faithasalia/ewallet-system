package com.example.heloworld.response;


import com.example.heloworld.data.master.model.Users;
import com.example.heloworld.request.ReadRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ReadResponse {
    public String responseCode;
    public String responseMessage;
    public ReadRequest dataRequest;
    public List<Users> data;
}
