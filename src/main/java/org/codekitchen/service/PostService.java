package org.codekitchen.service;

import jakarta.transaction.Transactional;
import org.codekitchen.entity.request.CreatePostRequest;
import org.codekitchen.entity.Post;
import org.codekitchen.entity.dto.PostDto;
import org.codekitchen.entity.PostsContainerDto;
import org.codekitchen.entity.request.UpdatePostRequest;
import org.codekitchen.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostsContainerDto findAll(){
        List<PostDto> posts = postRepository.findAll()
                .stream()
                .map(Post::toDto)
                .toList();
        return new PostsContainerDto(posts);
    }

    public PostDto findById(int id){
        return postRepository.findById(id)
                .map(Post::toDto)
                .orElseThrow(() -> new IllegalArgumentException("Post with id = " + id + " not found!"));

    }

    public PostDto save(CreatePostRequest request){
        return postRepository.save(request.toEntity()).toDto();
    }

    public PostDto update(int id, UpdatePostRequest request){
        return postRepository.findById(id)
                .map(existingPost -> {
                    Post updatedPost = request.toEntity(existingPost.getId(),existingPost.getCreationDate());
                    return postRepository.save(updatedPost).toDto();
                }).orElseThrow(() -> new IllegalArgumentException("Post with id = " + id + " not found!"));
    }

}
