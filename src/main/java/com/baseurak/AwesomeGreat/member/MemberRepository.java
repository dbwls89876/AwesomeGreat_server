package com.baseurak.AwesomeGreat.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>
{
    Member findByUserId(String userId);
    Member findByUserIdAndPassword(String userId, String password);
    void deleteById(String userId);
}
