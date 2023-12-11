package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable, String author, String headerOfBlog);

    boolean add(Blog blog);

    Blog findById(int id);

    Blog update(Blog blog);

    void deleteBlogById(int id);

    Page<Blog> getBlogByCat(Pageable pageable, int id);
}
