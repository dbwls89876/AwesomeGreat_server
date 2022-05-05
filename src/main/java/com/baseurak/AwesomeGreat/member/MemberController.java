package com.baseurak.AwesomeGreat.member;

import com.baseurak.AwesomeGreat.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping("/user")
    public /*Message*/void CreateUser(Member member) {
        memberService.CreateUser(member);

//        return message;
    }
}
