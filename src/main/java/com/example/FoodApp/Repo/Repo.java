package com.example.FoodApp.Repo;

import com.example.FoodApp.Model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends MongoRepository<Blog,Integer> {
}
