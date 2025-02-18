package org.example.todo_management_with_spring_security.domein.auth.user.impl;

import jakarta.persistence.*;
import lombok.*;
import org.example.todo_management_with_spring_security.domein.auth.user.impl.enums.Role;
import org.example.todo_management_with_spring_security.library.rest.AbstractEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;

@Entity
@Table(name = User.TABLE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Data
@Builder
public class User extends AbstractEntity implements UserDetails {
    public static final String TABLE = "users";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String ACCOUNT_NON_EXPIRED = "account_non_expired";
    private static final String ENABLED = "enabled";
    private static final String ACCOUNT_NON_LOCKED = "account_non_locked";
    private static final String CREDENTIALS_NON_EXPIRED = "credentials_non_expired";
    private static final String ROLES = "roles";

    //UserDetails Spring sequritynin bir kullanıcının kimlik duğrulama ve yetkilendime bilgilerini yönetmesini sağlar.

    @Column(name = USERNAME)
    private String username;

    @Column(name = PASSWORD)
    private String password;

    @Column(name = ACCOUNT_NON_EXPIRED)
    private boolean accountNonExpired;      //hesabının süresinin dolup dolmadığını

    @Column(name = ENABLED)
    private boolean enabled;                //hesabının etkin olup olmadığını

    @Column(name = ACCOUNT_NON_LOCKED)
    private boolean accountNonLocked;       //hesabının kilitli olup olmadığını

    @Column(name = CREDENTIALS_NON_EXPIRED)
    private boolean credentialsNonExpired;  //kimlik bilgilerinin süresinin dolup dolmadığını

    @Column(name = ROLES , nullable = false)
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @JoinTable(name = "authorities" , joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> authorities;

}
