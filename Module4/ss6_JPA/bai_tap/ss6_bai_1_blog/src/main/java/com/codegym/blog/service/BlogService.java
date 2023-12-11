package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.IBlogRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class BlogService implements IBlogService {
   @Autowired
   private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable, String author, String headerOfBlog) {
        return iBlogRepository.findBlogByAuthorContainingOrHeaderOfBlogContaining(pageable,author, headerOfBlog);
    }

    @Override
    @Transactional
    public boolean add(Blog blog) {
        Blog newBlog = iBlogRepository.save(blog);
        return (newBlog != null);
    }

    @Override
    @Transactional
    public Blog update(Blog blog) {
        return iBlogRepository.save(blog);
    }

    @Override
    @Transactional
    public void deleteBlogById(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> getBlogByCat(Pageable pageable, int id) {
        return iBlogRepository.findByCategory_Id(pageable, id);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).orElse(null);
    }

}
