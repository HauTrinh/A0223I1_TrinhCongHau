package com.codegym.picture.repository;

import com.codegym.picture.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.print.Pageable;

public interface IPictureRepository extends JpaRepository<Picture, Integer> {

}
