package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findBlogByAuthorContainingOrHeaderOfBlogContaining(Pageable pageable, String author, String headerOfBlog);

    @Query("SELECT b FROM Blog b join b.category  c where c.id = :id")
    Page<Blog> findByCategory_Id(Pageable pageable,@Param("id") int key);
}
