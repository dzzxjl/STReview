package com.dzzxjl.service;

import com.dzzxjl.dao.SongDao;
import com.dzzxjl.pojo.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {
    @Autowired
    private SongDao songDao;

    public void addSong(Song song){

        this.songDao.insert(song);

    }
}
