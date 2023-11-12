package com.codegym.play_music.repository;

import com.codegym.play_music.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    Music findById(Long id);

    void save (Music music);

    Music saveAndFlush(Music music);
    void deleteById(int id);
}
