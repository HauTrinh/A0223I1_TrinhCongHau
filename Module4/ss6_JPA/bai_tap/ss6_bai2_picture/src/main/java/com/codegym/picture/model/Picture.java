package com.codegym.picture.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="like_count")
    private Integer like;

    @Column(name="dislike_count")
    private Integer dislike;

    private Integer point; // Sửa từ int thành Integer

    @Column(name="author", columnDefinition = "nvarchar(100)")
    private String author;

    @Column(name="feedback", columnDefinition = "nvarchar(250)")
    private String feedback;
}
