package com.example.journal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.journal.entity.UserEntity;
import com.example.journal.models.UserDTO;
import com.example.journal.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
      
    }

    @PostMapping()
    public ResponseEntity<HttpStatus> saveMyValues(@RequestBody UserDTO userDTO) {
     
        try{
            UserEntity userEntity = new UserEntity(userDTO.getName(), userDTO.getAge());
        
            userService.saveAllValues(userEntity);
            return new ResponseEntity<>(HttpStatus.OK);
    }

        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
    }
 
    @GetMapping
    public String helloString(){
    return "hello";
}



    
}
