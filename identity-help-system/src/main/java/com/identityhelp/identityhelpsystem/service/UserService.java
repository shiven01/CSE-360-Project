package com.identityhelp.identityhelpsystem.service;

import com.identityhelp.identityhelpsystem.model.User;
import com.identityhelp.identityhelpsystem.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public boolean authenticate(String username, String password) {
        System.out.println("Attempting to authenticate user: " + username); // Debug log
        try {
            User user = userRepository.findByUsername(username);
            System.out.println("User found: " + (user != null)); // Debug log
            if (user == null) {
                return false;
            }
            return password.equals(user.getPassword());
        } catch (Exception e) {
            System.err.println("Authentication error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}