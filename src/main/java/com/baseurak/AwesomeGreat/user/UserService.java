package com.baseurak.AwesomeGreat.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService  {

    private final UserRepository userRepository;

    public User findUser(User user){ return userRepository.findByPersonalId(user.getPersonalId()); }

    public void createUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(String personalId) { userRepository.deleteById(personalId); }

    public List<User> readAllUsers() {
        return userRepository.findAll();
    }
}
