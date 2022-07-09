package com.baseurak.AwesomeGreat.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

//import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String personalId;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    private int demerit;

    public User(){}

    @Builder
    public User(String personalId, String password){
        this.personalId = personalId;
        this.password = password;
    }
}
