package com.codegym.picture.service;

import com.codegym.picture.model.Picture;
import com.codegym.picture.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PictureService implements IPictureService{

    @Autowired
    private IPictureRepository pictureRepository;

    @Override
    public boolean save(Picture picture) {
        Picture newPicture = pictureRepository.save(picture);
        return (newPicture != null);
    }

    @Override
    public Picture findById(Integer id) {
        return pictureRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Picture> findAll(Pageable pageable) {
        return pictureRepository.findAll(pageable);
    }
}
