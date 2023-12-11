package com.codegym.validate_form.service;

import com.codegym.validate_form.entity.User;
import com.codegym.validate_form.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public boolean save(User user){
        User newUser = userRepository.save(user);
        return (newUser != null);
    }

}
