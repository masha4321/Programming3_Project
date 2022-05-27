package com.project.Project.controller;

import com.project.Project.model.User;
import com.project.Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //TODO: HOME METHOD
    @GetMapping("/")
    public String home(){
        return "";
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }

//    @PutMapping("/users/{userId}")
//    public User updateUser(@PathVariable Long userId, @Valid @RequestBody User userRequest) {
//        return userRepository.findById(userId).map(user -> {
//            user.setTitle(userRequest.getTitle());
//            user.setDescription(userRequest.getDescription());
//            user.setContent(userRequest.getContent());
//            return userRepository.save(user);
//        }).orElseThrow(() -> new ResourceNotFoundException("UserId " + userId + " not found"));
//    }


}