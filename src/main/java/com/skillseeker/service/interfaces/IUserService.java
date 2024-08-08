package com.skillseeker.service.interfaces;

import com.skillseeker.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAllUsers();
    User saveUser(User user);
    Optional<User> findUserById(Long id);
    Optional<User> findUserByUsername(String username);
    Optional<User> findUserByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    void deleteUserById(Long id);
}
