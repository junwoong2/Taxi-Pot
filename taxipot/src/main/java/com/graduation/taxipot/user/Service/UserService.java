package com.graduation.taxipot.user.Service;

import com.graduation.taxipot.user.Dto.UserRequest;
import com.graduation.taxipot.user.Entity.User;
import com.graduation.taxipot.user.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(UserRequest dto) {
        return userRepository.save(User.builder()
                .name(dto.getName())
                .studentId(dto.getStudentId())
                .emailAddress(dto.getEmailAddress())
                .nickname(dto.getNickname())
                .phoneNumber(dto.getPhoneNumber())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
