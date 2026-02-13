package com.example.heloworld.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GreetingsResponse {
    public String message;
    public String waktu;
    public GreetingsResponse(){

    }

    public GreetingsResponse(String message, String waktu){
        this.message = message;
        this.waktu = waktu;
    }

    public GreetingsResponse sendResponse(String message, String waktu){
        GreetingsResponse result = new GreetingsResponse();
        result.setMessage(message);
        result.setWaktu(waktu);
        return result;
    }

    public GreetingsResponse sendResponse(String message, String waktu, String param3){

        this.setMessage(message);
        this.setWaktu(waktu);
        return this;
    }

}
