package com.graduation.taxipot.user.Service;

import com.graduation.taxipot.user.Entity.User;
import com.graduation.taxipot.user.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String emailAddress){
        return userRepository.findByEmailAddress(emailAddress)
                .orElseThrow(() -> new IllegalArgumentException((emailAddress)));
    }
}
