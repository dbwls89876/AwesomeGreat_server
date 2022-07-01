package com.baseurak.AwesomeGreat.post;

import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    void write(Post post);
    List<Post> read(Long postId1, Long postId2);
    Post read(Long postId);
    void modify(Long postId, String contents);
    void delete(Long postId);
}