package com.spring.blogSpringTest.service;

import com.spring.blogSpringTest.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
