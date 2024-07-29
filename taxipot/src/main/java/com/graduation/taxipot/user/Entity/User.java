package com.graduation.taxipot.user.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user_table")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="student_id", nullable = false, unique = true)
    private String studentId;

    @Column(name="phone_number", nullable = false, unique = true)
    private int phoneNumber;

    @Column(name="email_address", nullable = false, unique = true)
    private String emailAddress;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="nickname", nullable = false, unique = true)
    private String nickname;

    private int level;
    private int numberOfUsers;
    private String userCreateDate;

    @Builder
    public User(String emailAddress, String name, String nickname, String studentId, int phoneNumber, String password){
        this.emailAddress = emailAddress;
        this.password = password;
        this.name = name;
        this.studentId = studentId;
        this.phoneNumber = phoneNumber;
        this.nickname = nickname;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return List.of(new SimpleGrantedAuthority("user"));
    }

    @Override
    public String getUsername() {
        return emailAddress;
    }

    //아이디 잠겼는지 여부
    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    //아이디 사용 가능여부
    @Override
    public boolean isEnabled(){
        return true;
    }
}
