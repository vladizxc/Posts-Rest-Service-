package org.codekitchen.entity.dto;

import java.time.LocalDate;

public class PostDto {
    private final int id;
    private final String author;
    private final String title;
    private final int numberOfLikes;
    private final int numberOfDislikes;
    private final LocalDate creationTime;

    public PostDto(int id, String author, String title, int numberOfLikes, int numberOfDislikes, LocalDate creationTime) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.creationTime = creationTime;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public int getNumberOfDislikes() {
        return numberOfDislikes;
    }

    public LocalDate getCreationTime() {
        return creationTime;
    }
}
