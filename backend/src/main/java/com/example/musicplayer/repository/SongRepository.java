package com.example.musicplayer.repository;

import com.example.musicplayer.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findTop10ByOrderByPlaysDesc(); // Fetch trending songs
    List<Song> findByGenre(String genre);    // Fetch songs by genre
}
