package com.spring.blogSpringTest.reposiitory;

import com.spring.blogSpringTest.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {



}
