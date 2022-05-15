package com.baseurak.AwesomeGreat.user;

import com.baseurak.AwesomeGreat.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    UserService userService;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        //memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        User user = new User("00", "123");

        //when
//        memberService.join(member);
        User findMember = userService.findUser(user);

        //then
        Assertions.assertThat(user).isEqualTo(findMember);
    }
}
