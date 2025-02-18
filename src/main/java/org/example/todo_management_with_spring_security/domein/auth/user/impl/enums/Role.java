package org.example.todo_management_with_spring_security.domein.auth.user.impl.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ROLE_ADMIN,
    ROLE_USER,
    ROLE_SUPER_ADMIN;

    @Override
    public String getAuthority() {
        return null;
    }


}
