package com.hroddev.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hroddev.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String>
{

}
