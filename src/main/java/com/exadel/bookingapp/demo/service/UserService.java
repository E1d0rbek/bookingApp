package com.exadel.bookingapp.demo.service;

import com.exadel.bookingapp.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAllUser();

    User saveUser(User user);
}
