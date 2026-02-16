package com.springSecurity.springSecurity.services;

import com.springSecurity.springSecurity.Repo.UserRepo;
import com.springSecurity.springSecurity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public User addNewUser(String firstName, String lastName, String email, String password) {
        User user = new User(firstName, lastName, email, password);
        return userRepo.save(user);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
