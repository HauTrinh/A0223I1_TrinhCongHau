package com.codegym.picture.repository;

import com.codegym.picture.model.Picture;

import java.util.List;

public interface IPictureRepository {
    List<Picture> findAll();

    void save(Picture picture, boolean isLike, boolean isNew);

    Picture findById(int id);
}
