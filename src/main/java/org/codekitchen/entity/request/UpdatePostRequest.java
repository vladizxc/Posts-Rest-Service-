package org.codekitchen.entity.request;

import org.codekitchen.entity.Post;

import java.time.LocalDateTime;

public class UpdatePostRequest {
    private final String author;
    private final String title;
    private final int numberOfLikes;
    private final int numberOfDislikes;

    public UpdatePostRequest(String author, String title, int numberOfLikes, int numberOfDislikes) {
        this.author = author;
        this.title = title;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
    }

    public Post toEntity(int id, LocalDateTime creationDate){
        return new Post(
                id,
                title,
                author,
                numberOfLikes,
                numberOfDislikes,
                creationDate
        );
    }
}
