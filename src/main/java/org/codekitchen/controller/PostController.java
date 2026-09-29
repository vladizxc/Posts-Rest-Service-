package org.codekitchen.controller;

import org.codekitchen.entity.Post;
import org.codekitchen.entity.PostsContainerDto;
import org.codekitchen.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public PostsContainerDto findAll(){
        return postService.findAll();
    }
}
