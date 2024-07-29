package com.graduation.taxipot.user.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String emailAddress;
    private String password;
    private String StudentId;
    private int phoneNumber;
    private String nickname;
}
