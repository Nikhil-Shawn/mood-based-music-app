package com.example.musicplayer.service;

import com.example.musicplayer.model.Song;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SongService {
    public List<Song> getTrendingSongs() {
        // Return dummy trending songs
        return Arrays.asList(
                new Song(1L, "Blinding Lights", "The Weeknd", "After Hours", "Pop", 1500L),
                new Song(2L, "Levitating", "Dua Lipa", "Future Nostalgia", "Pop", 1200L),
                new Song(3L, "Save Your Tears", "The Weeknd", "After Hours", "Pop", 1000L)
        );
    }

    public List<Song> getSongsByGenre(String genre) {
        // Return dummy songs filtered by genre
        if ("Pop".equalsIgnoreCase(genre)) {
            return Arrays.asList(
                    new Song(1L, "Blinding Lights", "The Weeknd", "After Hours", "Pop", 1500L),
                    new Song(2L, "Levitating", "Dua Lipa", "Future Nostalgia", "Pop", 1200L)
            );
        } else if ("Rock".equalsIgnoreCase(genre)) {
            return Arrays.asList(
                    new Song(4L, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock", 900L),
                    new Song(5L, "Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV", "Rock", 800L)
            );
        }
        return List.of(); // Empty list if no songs match the genre
    }
}
