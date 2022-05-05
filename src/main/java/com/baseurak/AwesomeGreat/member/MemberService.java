package com.baseurak.AwesomeGreat.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member findUser(Member member){ return memberRepository.findByUserId(member.getId()); }

    public void CreateUser(Member member){ memberRepository.save(member); }

    public void deleteUser(String userId) { memberRepository.deleteById(userId); }

}
