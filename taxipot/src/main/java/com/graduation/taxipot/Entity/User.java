package com.graduation.taxipot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String StudentId;
    private int phoneNumber;
    private String emailAddress;
    private String nickname;
    private int level;
    private int numberOfUsers;
    private String userCreateDate;
}
