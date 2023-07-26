package net.javaguides.springbootrestfulwebservices.service;

import net.javaguides.springbootrestfulwebservices.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);
}
