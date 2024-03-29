package com.axmedbek.jwt_kibanna.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("javainuse".equals(username)) {
            return new User("javainuse",
                    "$2y$10$3X/18JvdXosWcuJNgLVjzOjZHodz0gKj4dFUVE/8uWVlIgeODgKP.", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username");
        }
    }
}
