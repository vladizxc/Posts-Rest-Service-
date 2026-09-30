package org.codekitchen.entity;

import org.codekitchen.entity.dto.PostDto;

import java.util.List;

public class PostsContainerDto {
    private final List<PostDto> posts;

    public PostsContainerDto(List<PostDto> posts){
        this.posts = posts;
    }

    public List<PostDto> getPosts(){
        return posts;
    }
}
