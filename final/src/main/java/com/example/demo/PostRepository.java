package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
