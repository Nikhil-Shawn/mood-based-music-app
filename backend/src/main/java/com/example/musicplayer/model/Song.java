package com.example.musicplayer.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "songs")
@NoArgsConstructor // No-argument constructor for Hibernate
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private String album;
    private String genre;
    private Long plays;

    // Custom constructor for initialization (avoid duplicate definition)
    public Song(Long id, String title, String artist, String album, String genre, Long plays) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.plays = plays;
    }
}
