package com.baseurak.AwesomeGreat.member;

import com.baseurak.AwesomeGreat.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member("00", "123");

        //when
//        memberService.join(member);
        Member findMember = memberService.findUser(member);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
