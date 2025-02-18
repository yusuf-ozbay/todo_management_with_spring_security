package org.example.todo_management_with_spring_security.domein.auth.user.api;

import lombok.Builder;
import org.example.todo_management_with_spring_security.domein.auth.user.impl.enums.Role;

import java.util.Set;
@Builder
public class UserDto {
    private String id;
    private String username;
    private String password;
    private boolean accountNonExpired;
    private boolean enabled;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private Set<Role> authorities;
}
