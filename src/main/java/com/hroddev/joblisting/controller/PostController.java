package com.hroddev.joblisting.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hroddev.joblisting.model.Post;
import com.hroddev.joblisting.repository.PostRepository;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PostController
{
    @Autowired
    PostRepository postRepository;

    @Hidden @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return postRepository.save(post);
    }

}
