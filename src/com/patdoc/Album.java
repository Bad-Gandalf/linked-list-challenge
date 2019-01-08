package com.patdoc;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        if (songExists(song)){
            System.out.println("Song already in album");
        }else {
            this.songs.add(song);
        }
    }

    public void removeSong(Song song){
        this.songs.remove(song);
    }

    public String getName() {
        return name;
    }

    public boolean songExists(Song song){
        for(int i=0; i<songs.size(); i++){
            if (songs.get(i) == song){
                return true;
            }
        }return false;
    }
}
