package com.exadel.bookingapp.demo.service;

import com.exadel.bookingapp.demo.entity.User;
import com.exadel.bookingapp.demo.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

   private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser()
    {
        return (List<User>)
                userRepository.findAll();
    }

    @Override
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
}
