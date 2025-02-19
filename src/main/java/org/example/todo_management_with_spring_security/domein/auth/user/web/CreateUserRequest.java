package org.example.todo_management_with_spring_security.domein.auth.user.web;


import org.example.todo_management_with_spring_security.domein.auth.user.impl.enums.Role;

import java.util.Set;

public class CreateUserRequest {
    public String username;
    public String password;
    public Set<Role> authorities;
}
