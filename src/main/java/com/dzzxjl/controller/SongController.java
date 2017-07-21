package com.dzzxjl.controller;

import com.dzzxjl.pojo.Song;
import com.dzzxjl.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/song")
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping("addSong")
    @ResponseBody
    public Song addSong(@RequestParam("songName") String songName,
                          @RequestParam("songSinger") String songSinger,
                          @RequestParam("songAddress") String songAddress,
                          HttpServletRequest request,
                          Model model){

        Song song = new Song(songName,songSinger,songAddress);
        this.songService.addSong(song);
        model.addAttribute(song);
        return song;
//        return "song/song";
    }

}
