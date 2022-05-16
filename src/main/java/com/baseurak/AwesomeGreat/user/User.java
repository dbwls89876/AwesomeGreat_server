package com.baseurak.AwesomeGreat.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
//@Entity
public class User implements UserDetails {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String userId;
    private String password;
    private String email;
    private UserRole roll;

    @Builder
    public User(String userId, String password){
        this.userId = userId;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    // 계정 만료 확인, true : 만료안됨
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 계정 잠금 확인, trueh : 잠금x
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}
