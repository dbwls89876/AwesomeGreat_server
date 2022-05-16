package com.baseurak.AwesomeGreat.user;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MemoryUserRepository implements UserRepository{
    @Override
    public User findByUserId(String userId) {
        return null;
    }

    @Override
    public User findByUserIdAndPassword(String userId, String password) {
        return null;
    }

    @Override
    public void deleteById(String userId) {

    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
