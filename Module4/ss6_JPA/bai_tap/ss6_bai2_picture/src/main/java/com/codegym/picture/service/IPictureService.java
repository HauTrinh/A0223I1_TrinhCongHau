package com.codegym.picture.service;

import com.codegym.picture.model.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPictureService {
    boolean save(Picture picture);
    Picture findById(Integer id);
    Page<Picture> findAll(Pageable pageable);
}
