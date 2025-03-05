package org.example.todo_management_with_spring_security.domein.auth.user.web;

import lombok.RequiredArgsConstructor;
import org.example.todo_management_with_spring_security.domein.auth.user.api.UserDto;
import org.example.todo_management_with_spring_security.domein.auth.user.api.UserService;
import org.example.todo_management_with_spring_security.domein.auth.user.impl.User;
import org.example.todo_management_with_spring_security.domein.auth.user.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public UserDto createuser(@RequestBody CreateUserRequest createUserRequest) {
        return toDto(userService.createUser(createUserRequest));
    }

    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .accountNonExpired(user.isAccountNonExpired())
                .enabled(user.isEnabled())
                .accountNonLocked(user.isAccountNonLocked())
                .credentialsNonExpired(user.isCredentialsNonExpired())
                .authorities(user.getAuthorities())
                .build();
    }
}
