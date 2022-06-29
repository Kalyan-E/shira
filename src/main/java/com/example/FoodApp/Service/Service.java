package com.example.FoodApp.Service;

import com.example.FoodApp.Model.Blog;
import com.example.FoodApp.Repo.Repo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Transactional
public class Service {



    private final Repo repo;
    public void addBlog(Blog blog) {
        repo.insert(blog);
    }
}
