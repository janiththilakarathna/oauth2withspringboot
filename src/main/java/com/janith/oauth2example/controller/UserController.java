package com.janith.oauth2example.controller;

import com.janith.oauth2example.exception.ResourceNotFoundException;
import com.janith.oauth2example.model.User;
import com.janith.oauth2example.repository.UserRepository;
import com.janith.oauth2example.security.CurrentUser;
import com.janith.oauth2example.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janith Thilakarathna on 12/14/18
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }

}
