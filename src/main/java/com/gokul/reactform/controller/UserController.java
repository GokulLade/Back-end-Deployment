package com.gokul.reactform.controller;

import com.gokul.reactform.model.User;
import com.gokul.reactform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://front-end-deployment-ten.vercel.app") // safer in production
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // POST: Save form data
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // GET: Get all user data
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
