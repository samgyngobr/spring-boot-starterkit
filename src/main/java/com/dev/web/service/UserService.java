package com.dev.web.service;

import com.dev.web.model.User;
import com.dev.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public void save(
              String name
            , String email
            , String email_verified_at
            , String password
            , String remember_token
            , String created_at
            , String updated_at
    )
    {
        userRepository.save( new User(
                  name
                , email
                , email_verified_at
                , password
                , remember_token
                , created_at
                , updated_at
        ));
    }

    public List<User> findAll()
    {
        return userRepository.findAll();
    }

    public User findUserByEmail(String email)
    {
        return userRepository.findByEmail(email);
    }

}
