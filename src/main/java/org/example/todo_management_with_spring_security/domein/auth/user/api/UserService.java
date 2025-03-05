package org.example.todo_management_with_spring_security.domein.auth.user.api;

import org.example.todo_management_with_spring_security.domein.auth.user.impl.User;
import org.example.todo_management_with_spring_security.domein.auth.user.web.CreateUserRequest;

import java.util.Optional;

public interface UserService {
     User createUser(CreateUserRequest createUserRequest);
    Optional<User> getByUsername(String username);
}
