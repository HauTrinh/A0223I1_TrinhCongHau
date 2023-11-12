package com.codegym.play_music.repository;

import com.codegym.play_music.model.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = entityManager.createQuery("from Music", Music.class);
        return query.getResultList();
    }

    @Override
    public Music findById(Long id) {
        return entityManager.find(Music.class, id);
    }

    @Override
    @Transactional
    public void save(Music music) {
        try {
            entityManager.persist(music);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    @Transactional
    public Music saveAndFlush(Music music) {
        music = entityManager.merge(music);
        //Phương thức này sử dụng để đưa thực thể (entity) vào trạng thái quản lý của EntityManager. Xem tồn tại hay không
        entityManager.flush();
        // Phương thức này chủ yếu được sử dụng để đẩy các thay đổi của các thực thể đã được quản lý (managed entities) từ bộ nhớ của EntityManager xuống cơ sở dữ liệu
        return music;
        //Trả về thực thể đã được lưu và đồng bộ hóa với cơ sở dữ liệu.
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Music Music = entityManager.find(Music.class, id);
        entityManager.remove(Music);
    }
}
