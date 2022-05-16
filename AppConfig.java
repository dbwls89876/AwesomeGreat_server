package com.baseurak.AwesomeGreat;

import com.baseurak.AwesomeGreat.post.MemoryPostRepository;
import com.baseurak.AwesomeGreat.post.PostRepository;
import com.baseurak.AwesomeGreat.post.PostService;
import com.baseurak.AwesomeGreat.post.PostServiceImpl;
import com.baseurak.AwesomeGreat.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    public MemberService memberService() {
//        return new MemberServiceImpl(memberRepository());
//    }
//
//    @Bean
//    public UserRepository userRepository() {
//        return new MemoryUserRepositoey();
//    }

    @Bean
    public PostService postService() {
        return new PostServiceImpl(postRepository());
    }

    @Bean
    public PostRepository postRepository() {
        return new MemoryPostRepository();
    }

}
