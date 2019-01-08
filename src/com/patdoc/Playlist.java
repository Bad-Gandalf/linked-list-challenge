package com.patdoc;


import java.util.*;

public class Playlist {
    private ArrayList<Album> albums;
    private String name;
    private LinkedList<Song> playlist;

    public Playlist(String name) {
        this.name = name;
        this.albums = new ArrayList<Album>();
        this.playlist = new LinkedList<Song>();
    }

    public static void main(String[] args) {
        Song letsStayTogether = new Song("Let's stay together", 3.45);
        Song moveOnUp = new Song("Move On Up", 8.48);
        Song superstition = new Song("Superstition", 4.56);
        Song september = new Song("September", 4.03);
        Song whatsGoingOn = new Song("Whats going on", 3.43);
        Song carwash = new Song("Carwash", 3.22);
        Song lovelyDay = new Song("Lovely Day", 4.59);
        Song giveMeTheNight = new Song("Give me the night", 5.20);

        Album firstAlbum = new Album("Album 1");
        firstAlbum.addSong(letsStayTogether);
        firstAlbum.addSong(moveOnUp);
        firstAlbum.addSong(superstition);
        firstAlbum.addSong(september);
        firstAlbum.addSong(whatsGoingOn);
        Album secondAlbum = new Album("Album 2");
        secondAlbum.addSong(carwash);
        secondAlbum.addSong(lovelyDay);


        Playlist soulHour = new Playlist("Soul Hour");
        soulHour.addAlbumToPlaylist(firstAlbum);
        soulHour.addAlbumToPlaylist(secondAlbum);

        soulHour.addSongToPlaylist(moveOnUp);
        soulHour.addSongToPlaylist(giveMeTheNight);
        soulHour.addSongToPlaylist(carwash);
        soulHour.addSongToPlaylist(lovelyDay);
        soulHour.addSongToPlaylist(september);
        soulHour.addSongToPlaylist(whatsGoingOn);
        soulHour.usePlaylist();
    }

    private void addAlbumToPlaylist(Album album) {
        this.albums.add(album);
    }

    private void setName(String name) {
        this.name = name;
    }

    private boolean addSongToPlaylist(Song song){
        for(int i=0; i<albums.size(); i++){
            if (albums.get(i).songExists(song)){
                this.playlist.add(song);
                System.out.println("New song added: " + song.getTitle());
                return true;
            }
        }
        System.out.println("This song is not present in your albums therefore" +
                " it can not be added.");
        return false;

    }


    private void removeSongFromPlaylist(Song song){
        if(this.playlist.contains(song)){
          this.playlist.remove(song);
            System.out.println("Song successfully removed");
        }else{
            System.out.println("Song does not exist on this playlist");
        }
    }

    private void printPlaylist(){
        Iterator<Song> i = playlist.iterator();
        while(i.hasNext()){
            System.out.println(i.next().getTitle());
        }
    }

    private void usePlaylist() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing -----> " + listIterator.next().getTitle() +
                    "\n**********************************");
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing -----> " + listIterator.next().getTitle());
                        } else {
                            System.out.println("Reached end of playlist");
                            goingForward = false;
                        }

                        break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;

                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing -----> " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    System.out.println("Restarting ----> " + listIterator.next().getTitle());
                    listIterator.previous();
                    break;

                case 4:
                    printMenu();
                    break;

                case 5:
                    printPlaylist();
                    break;

            }

        }
    }

        private void printMenu(){
            System.out.println("Available actions:\npress ");
            System.out.println("0 - to quit\n" +
                    "1 - skip to next song\n" +
                    "2 - go to previous song\n" +
                    "3 - replay current song\n" +
                    "4 - View menu\n" +
                    "5 - View Playlist");
        }
    }

