package com.springboot.main.resources;

import com.springboot.main.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Murilo","mu-silva@outlook.com","18981695942","12345");
        return ResponseEntity.ok().body(u);
    }
}
