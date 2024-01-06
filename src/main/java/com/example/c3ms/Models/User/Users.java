package com.example.c3ms.Models.User;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Users {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private JsonNode configuration;

}
