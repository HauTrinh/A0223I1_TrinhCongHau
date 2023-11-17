package com.codegym.blog.service;

import com.codegym.blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    boolean add(Blog blog);
    Blog update(Blog blog);
    void deleteBlogById(int id);

    Blog findById(int id);
}
