package com.baseurak.AwesomeGreat.login;

import com.baseurak.AwesomeGreat.user.User;
import com.baseurak.AwesomeGreat.user.UserRepository;

public class LoginService {
    private UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String loginId, String password) {
        User findUser = userRepository.findByUserId(loginId);
        if (findUser == null) { return null; }
        else { return findUser; }
    }
}
