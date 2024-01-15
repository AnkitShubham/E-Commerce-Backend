package dev.project.ecommerce.repositories;

import dev.project.ecommerce.entities.User;

public interface UserRepository{
    User addUser(User user);
    User getUserByEmail(String email);

}
