package net.javaguides.springbootrestfulwebservices.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springbootrestfulwebservices.entity.User;
import net.javaguides.springbootrestfulwebservices.repository.UserRepository;
import net.javaguides.springbootrestfulwebservices.service.UserService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
