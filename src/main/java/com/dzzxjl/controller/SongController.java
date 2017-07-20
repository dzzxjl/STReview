package com.dzzxjl.controller;

import com.dzzxjl.pojo.Song;
import com.dzzxjl.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/song")
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping("addSong")
    public String addSong(HttpServletRequest request, Model model){
        String songName = request.getParameter("songName");
        String songSinger = request.getParameter("songSinger");
        String songAddress = request.getParameter("songaddress");
        Song song = new Song(songName,songSinger,songAddress);
        this.songService.addSong(song);
        model.addAttribute(song);
        return "song/song";
    }
}
