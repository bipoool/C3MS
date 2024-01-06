package com.example.c3ms.Controllers;

import java.util.List;

import com.example.c3ms.Models.User.Users;
import com.example.c3ms.Repositories.UserRepo;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user) {
        return userRepo.save(user);
    }

    @GetMapping("/getAllUser")
    public List<Users> getAllUser() {
        return userRepo.findAll();
    }

    @GetMapping("/get")
    public Users getUser(@RequestParam @Nullable String email) {
        return userRepo.getUsersByEmail(email);
    }
}