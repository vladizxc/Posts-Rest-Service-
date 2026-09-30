package org.codekitchen.entity;

import jakarta.persistence.*;
import org.codekitchen.entity.dto.PostDto;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "author", nullable = false, length = 30)
    private String author;

    @Column(name = "number_of_likes", nullable = false)
    private int numberOfLikes;

    @Column(name = "number_of_dislikes", nullable = false)
    private int numberOfDislikes;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    public Post() {}

    public Post(int id, String title, String author, int numberOfLikes, int numberOfDislikes, LocalDateTime creationDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.creationDate = creationDate;
    }

    public Post(String title, String author, int numberOfLikes, int numberOfDislikes, LocalDateTime creationDate) {
        this.title = title;
        this.author = author;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfDislikes() {
        return numberOfDislikes;
    }

    public void setNumberOfDislikes(int numberOfDislikes) {
        this.numberOfDislikes = numberOfDislikes;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public PostDto toDto(){
        return new PostDto(
                id,
                author,
                title,
                numberOfLikes,
                numberOfDislikes,
                creationDate.toLocalDate()
        );
    }
}
