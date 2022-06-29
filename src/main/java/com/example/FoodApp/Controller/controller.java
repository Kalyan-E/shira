package com.example.FoodApp.Controller;

import com.example.FoodApp.Model.Blog;
import com.example.FoodApp.Repo.Repo;
import com.example.FoodApp.Service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@RequiredArgsConstructor
public class controller {
    @Autowired
    private final Service service;
    @Autowired
    private final Repo repo;
    @PostMapping("/add")
    public ResponseEntity addBlog(@RequestBody Blog blog) {
        service.addBlog(blog);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @DeleteMapping("/delete")
    public void deleteBlog(){
        repo.deleteAll();
    }
    @GetMapping("/findBlogs")
    public List<Blog> getBlogs() {
        return repo.findAll();
    }

    }



