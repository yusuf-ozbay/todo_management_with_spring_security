package org.example.todo_management_with_spring_security.library.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoder {

    //BCryptPasswordEncoder: Spring Security tarafından sağlanan bir şifreleme sınıfıdır.
    //Bu sınıf, BCrypt algoritmasını kullanarak şifreleri hash'ler (şifreler)
    // .çünkü şifreleerimizi düz metin şeklinde tutmamamız gerekir

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
