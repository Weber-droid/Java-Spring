package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController 
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    // @Autowired
    public UserController ( UserService userService ) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById (@PathVariable Long id) {
        return userService.getUserById(id)
                          .map(ResponseEntity::ok)
                          .orElse(ResponseEntity.notFound().build());
    } 

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<User> updateUser (@PathVariable Long id, @RequestBody User userDetail) {
    //     return userService.getUserById(id)
    //                       .map(
    //                         user -> {
    //                             User updatedUser = userService.updateUser(id, userDetail);
    //                             return ResponseEntity.ok(updatedUser);
    //                         }
    //                       )
    //                       .orElse(ResponseEntity.notFound().build());
        
    // }

    

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser (@PathVariable Long id) {
        if (userService.getUserById(id).isPresent()){
            userService.deleteUser(id);
            ResponseEntity.noContent().build();
        }

    
        return ResponseEntity.notFound().build();        
                
    }


}
