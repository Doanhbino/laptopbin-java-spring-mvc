package com.binlaptop.laptopbin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.binlaptop.laptopbin.domain.User;
import com.binlaptop.laptopbin.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handleHello() {
        return "Hello from service";
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User handleSaveUser(User user) {
        User doanhbino = this.userRepository.save(user);
        System.out.println(doanhbino);
        return doanhbino;
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public void deleteAUser(long id) {
        this.userRepository.deleteById(id);
    }

}
