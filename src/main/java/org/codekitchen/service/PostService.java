package org.codekitchen.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PostService {

    private final PostService postService;

    @Autowired
    public PostService(PostService postService) {
        this.postService = postService;
    }


}
