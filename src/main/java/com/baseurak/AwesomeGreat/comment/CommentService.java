package com.baseurak.AwesomeGreat.comment;

import java.util.List;

public interface CommentService{
    void write(Comment comment);
    List<Comment> read(Long postId);
    void modify(Long commentId, String contents);
    void delete(Long commentId);
}
