package org.codekitchen.service;

import jakarta.transaction.Transactional;
import org.codekitchen.entity.Post;
import org.codekitchen.entity.PostDto;
import org.codekitchen.entity.PostsContainerDto;
import org.codekitchen.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
