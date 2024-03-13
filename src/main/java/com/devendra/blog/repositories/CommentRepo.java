package com.devendra.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devendra.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
