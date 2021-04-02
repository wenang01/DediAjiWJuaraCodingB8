package com.jpa.relations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relations.entity.Post;

public interface PostReopsitory extends JpaRepository<Post, Long>{

}
