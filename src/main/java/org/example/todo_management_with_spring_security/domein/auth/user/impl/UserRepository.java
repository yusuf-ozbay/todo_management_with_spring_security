package org.example.todo_management_with_spring_security.domein.auth.user.impl;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , String> {
}
