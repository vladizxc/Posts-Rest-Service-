package org.codekitchen.entity.request;

import org.codekitchen.entity.Post;

import java.time.LocalDateTime;

public class CreatePostRequest {

    private final String author;
    private final String title;

    public CreatePostRequest(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Post toEntity(){
        return new Post(
                title,
                author,
                0,
                0,
                LocalDateTime.now()
        );
    }
}
