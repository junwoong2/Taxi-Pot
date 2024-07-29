package com.graduation.taxipot.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_table")
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
