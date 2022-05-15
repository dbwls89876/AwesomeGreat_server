package com.baseurak.AwesomeGreat.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUser(User user){ return userRepository.findByUserId(user.getId()); }

    public void CreateUser(User user){ userRepository.save(user); }

    public void deleteUser(String userId) { userRepository.deleteById(userId); }

}
