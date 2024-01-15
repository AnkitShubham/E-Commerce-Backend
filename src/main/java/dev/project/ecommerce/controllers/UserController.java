package dev.project.ecommerce.controllers;

import dev.project.ecommerce.entities.User;
import dev.project.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepo;


    @PostMapping("/signup")
    public User signUp(@RequestBody User user){
        return this.userRepo.addUser(user);
    }

//    @PostMapping("/login")
//    public User login(@RequestParam String email, @RequestParam String password){
//        System.out.println(email);
//        User user = userRepo.getUserByEmail(email);
//        if (user != null && user.getPassword().equals(password)) {
//            return user;
//        } else {
//            return null;
//        }
//    }

    @PostMapping("/login")
    public User login(@RequestBody User tempUser){
        System.out.println(tempUser.getEmail());
        User user = userRepo.getUserByEmail(tempUser.getEmail());
        if (user != null && user.getPassword().equals(tempUser.getPassword())) {
            return user;
        } else {
            return null;
        }
    }
}
