package com.dev.web.model;

import lombok.Builder;
import lombok.Getter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Document(collection = "user")
@Getter
public class User
{
    @Id
    private String id;
    private String name;
    private String email;
    private String email_verified_at;
    private String password;
    private String remember_token;
    private String created_at;
    private String updated_at;

    public User() {}

    public User(
            String name,
            String email,
            String email_verified_at,
            String password,
            String remember_token,
            String created_at,
            String updated_at
            )
    {
        super();
        this.name              = name;
        this.email             = email;
        this.email_verified_at = email_verified_at;
        this.password          = password;
        this.remember_token    = remember_token;
        this.created_at        = created_at;
        this.updated_at        = LocalDateTime.now().format( DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm") );
    }

}
