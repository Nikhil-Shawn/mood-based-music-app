package com.example.musicplayer.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private String album;
    private String genre;
    private Long plays;
}
