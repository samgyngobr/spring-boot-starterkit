package com.dev.web.repository;

import com.dev.web.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>
{
    User findByEmail(String email);

    //@Query("{name:'?0'}")
    //User findItemByName(String name);

    //@Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    //List<User> findAll(String category);

    //public long count();
}
