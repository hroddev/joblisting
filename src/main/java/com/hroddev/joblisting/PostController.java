package com.hroddev.joblisting;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PostController
{
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("/swagger-ui.html");
    }

}
