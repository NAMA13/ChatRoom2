package com.chat.room.Service;

import com.chat.room.Model.User;
import com.chat.room.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public void save(User user) {
        repository.save(user);
    }

}