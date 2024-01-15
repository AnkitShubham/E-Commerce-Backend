package dev.project.ecommerce.services;

import dev.project.ecommerce.dao.UserDao;
import dev.project.ecommerce.entities.User;
import dev.project.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements UserRepository {

    @Autowired
    private UserDao userDao;


    //Adding user details to database
    @Override
    public User addUser(User user){
        userDao.save(user);
        return user;
    }

    //Finding user from database
    public User getUserByEmail(String email){
        return userDao.findByEmail(email);
    }

}
