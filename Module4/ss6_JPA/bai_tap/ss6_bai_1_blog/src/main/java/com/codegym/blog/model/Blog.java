package com.codegym.blog.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "blog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    @Column(name = "header_of_blog")
    private String headerOfBlog;
    private String content;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

}
