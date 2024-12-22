package com.example.musicplayer.repository;

import com.example.musicplayer.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findTop10ByOrderByPlaysDesc(); // Fetch trending songs
    List<Song> findByGenre(String genre);    // Fetch songs by genre
}
