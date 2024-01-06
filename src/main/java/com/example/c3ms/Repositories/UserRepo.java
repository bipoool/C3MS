package com.example.c3ms.Repositories;

import com.example.c3ms.Models.User.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<Users,String> {
    Users getUsersByName(String name);
    Users getUsersByEmail(String email);
}