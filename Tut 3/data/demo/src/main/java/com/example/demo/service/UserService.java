package com.example.demo.service;

import java.util.List;
import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    // @Autowired
    public UserService ( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById ( Long id) {
        return userRepository.findById(id);
    }

    public User createUser (User user) {
        return userRepository.save(user);
    }


    public User createUser (Long id, User userDetail ) {
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        user.setEmail(userDetail.getEmail());
        user.setUsername(userDetail.getUsername());
        user.setPassword(userDetail.getPassword());
        return userRepository.save(user);
    }

    public void deleteUser (Long id) {
        userRepository.deleteById(id);
    }

}
