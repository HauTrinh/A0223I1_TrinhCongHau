package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.IBlogRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class BlogService implements IBlogService {
   @Autowired
   private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
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
        return iBlogRepository.saveAndFlush(blog);
    }

    @Override
    @Transactional
    public void deleteBlogById(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).orElse(null);
    }

}
