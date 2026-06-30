package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User findUserByName(String username);
    User findUserById(Long userId);
    List<User> allUsers();
    boolean saveUser(User user);
    boolean deleteUser(Long userId);
    List<Role> listRoles();
}
