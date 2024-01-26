package com.hroddev.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString @Document(collection = "JobPost")
public class Post
{
    private String profile;
    private String desc;
    private String exp;
    private String techs[];
}
