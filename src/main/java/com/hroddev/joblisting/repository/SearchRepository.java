package com.hroddev.joblisting.repository;

import java.util.List;

import com.hroddev.joblisting.model.Post;

public interface SearchRepository
{
    List<Post> findByText(String text);
}
