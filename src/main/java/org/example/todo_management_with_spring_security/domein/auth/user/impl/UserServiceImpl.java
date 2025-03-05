package org.example.todo_management_with_spring_security.domein.auth.user.impl;

import lombok.RequiredArgsConstructor;
import org.example.todo_management_with_spring_security.domein.auth.user.api.UserService;
import org.example.todo_management_with_spring_security.domein.auth.user.web.CreateUserRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;


    public Optional<User> getByUsername(String username){
        return repository.findByUsername(username);
    }

    public User createUser(CreateUserRequest createUserRequest){
        User newUser = User.builder()
                .username(createUserRequest.username)
                .password(passwordEncoder.encode(createUserRequest.password))
                .authorities(createUserRequest.authorities)
                .enabled(true)
                .accountNonLocked(true)
                .credentialsNonExpired(true)
                .accountNonExpired(true)
                .build();
        return repository.save(newUser);
    }

}
