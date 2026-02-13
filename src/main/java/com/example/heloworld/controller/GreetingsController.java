package com.example.heloworld.controller;

import com.example.heloworld.data.master.model.Users;
import com.example.heloworld.data.master.repo.UsersRepository;
import com.example.heloworld.request.CreateRequest;
import com.example.heloworld.request.ReadRequest;
import com.example.heloworld.response.CreateResponse;
import com.example.heloworld.response.GreetingsResponse;
import com.example.heloworld.response.ReadResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class GreetingsController {
    public final UsersRepository usersRepository;

    public GreetingsController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/grit/{waktu}")
    public GreetingsResponse grit(String firstname, String lastname, @PathVariable String waktu){
        String teks =  "hello, " + firstname + " " + lastname + "!";
        GreetingsResponse result = new GreetingsResponse();
        return result.sendResponse(teks, waktu, "");
    }

    @PostMapping("/createUser")
    public CreateResponse createUser(
            @RequestBody
            CreateRequest request){
        // TODO logic create data user
        Users dataUser = new Users();
        dataUser.setId(UUID.randomUUID().toString());
        dataUser.setEmail(request.getEmail());
        dataUser.setUsername(request.getUsername());
        dataUser.setPassword(request.getPassword());
        dataUser.setAge(request.getAge());
        dataUser.setAddress(request.getAddress().getStreet() + ", " + request.getAddress().getCity() + ", " + request.getAddress().getProvince());
        usersRepository.save(dataUser);
        CreateResponse result = new CreateResponse();
        result.setResponseCode("00");
        result.setResponseMessage("Create Success");
        result.setDataRequest(request);
        return result;
    }

    //pr readuser
    @GetMapping("/readUser")
    public ReadResponse readUser(
            @RequestBody
            ReadRequest request){
        ReadResponse result = new ReadResponse();
        result.setResponseCode("00");
        result.setResponseMessage("Create Success");
        result.setDataRequest(request);
        return result;
    }
    //db postgre (user) install
}
