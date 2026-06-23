package ru.kata.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepositories;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{

    private final RoleRepositories roleRepositories;

    @Autowired
    public RoleServiceImpl(RoleRepositories roleRepositories) {
        this.roleRepositories = roleRepositories;
    }

    @Override
    public Role save(Role role) {
        return roleRepositories.save(role);
    }

    @Override
    public List<Role> findAll() {
        return roleRepositories.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return roleRepositories.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        roleRepositories.deleteById(id);
    }

    @Override
    public Optional<Role> findByRole(String role) {
        return roleRepositories.findByRole(role);
    }
}
