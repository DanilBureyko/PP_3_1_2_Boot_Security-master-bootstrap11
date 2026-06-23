package ru.kata.spring.boot_security.demo.services;




import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    User save(User user);
    void deleteById(Long id);
    void updateUser(User user);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
}
