package dev.project.ecommerce.dao;

import dev.project.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {
    User findByEmail(String email);
}
