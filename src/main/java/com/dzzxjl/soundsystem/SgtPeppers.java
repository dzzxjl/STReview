package com.dzzxjl.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    private String title = "title";
    private String artist = "artist";

    public void play() {
        System.out.println("title: " + title + ", artist" + artist);
    }
}
