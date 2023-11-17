package com.codegym.picture.repository;

import com.codegym.picture.model.Picture;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PictureRepository implements IPictureRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Picture> findAll() {
        TypedQuery<Picture> typedQuery = entityManager.createQuery("select p from Picture p", Picture.class);
        return typedQuery.getResultList();
    }

    @Transactional
    @Override
    public void save(Picture picture, boolean isLike, boolean isNew) {
       try{
           if (isNew) {
               entityManager.persist(picture);
           } else {
               if (isLike) {
                   picture.setLike(picture.getLike() + 1);
               } else {
                   picture.setDislike(picture.getDislike() + 1);
               }
               entityManager.merge(picture);
           }
       } catch (Exception ex){
           ex.printStackTrace();
       }
    }

    @Override
    public Picture findById(int id) {
        return entityManager.find(Picture.class,id);
    }

}
