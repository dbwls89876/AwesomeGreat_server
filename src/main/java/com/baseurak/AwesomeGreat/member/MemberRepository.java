package com.baseurak.AwesomeGreat.member;

public interface MemberRepository {
        void save(Member member);
        Member findById(Long memberId);
}
