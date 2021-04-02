package com.jpa.relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relations.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
