package com.example.musicplayer.controller;

import com.example.musicplayer.model.Song;
import com.example.musicplayer.service.SongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {
    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/trending")
    public List<Song> getTrendingSongs() {
        return songService.getTrendingSongs();
    }

    @GetMapping("/genre")
    public List<Song> getSongsByGenre(@RequestParam String genre) {
        return songService.getSongsByGenre(genre);
    }
}
