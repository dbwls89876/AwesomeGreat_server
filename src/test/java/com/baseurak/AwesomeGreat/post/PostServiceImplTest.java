package com.baseurak.AwesomeGreat.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostServiceImplTest {

    @Autowired
    PostService postService;

    @Test
    void write(){
        Post post = new Post();
        post.setId(0L);
        post.setContent("테스트!");
        postService.write(post);
    }

}