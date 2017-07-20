package com.dzzxjl.pojo;

public class Song {

    private Integer id; //歌曲id
    private String songName; //歌名
    private String songSinger; //歌手
    private String songAddress; //链接

    public Song(String songName, String songSinger, String songAddress) {
        this.songName = songName;
        this.songSinger = songSinger;
        this.songAddress = songAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongSinger() {
        return songSinger;
    }

    public void setSongSinger(String songSinger) {
        this.songSinger = songSinger;
    }

    public String getSongAddress() {
        return songAddress;
    }

    public void setSongAddress(String songAddress) {
        this.songAddress = songAddress;
    }



}
