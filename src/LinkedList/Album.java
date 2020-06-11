package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String albumName;
    private ArrayList<Song> album = new ArrayList<Song>();


    public Album(String albumName) {
        super();
        this.album = new ArrayList<>();
        this.albumName = albumName;
    }


    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }





    public boolean addSongToAlbum(String song, double duration){

        Song songSearched = findSong(song);

        if(songSearched == null){

            this.album.add(new Song(song, duration));
            return true;

        }

        else{
            System.out.println("Cant be added as its already in the album");
            return false;
        }
    }

    public boolean addSongToPlayList(int trackNumber, LinkedList<Song> myList){

        int index = trackNumber -1;

        if((index >=0) && (index <= this.album.size())){

            myList.add(this.album.get(index));
            System.out.println("Track " +trackNumber + " added to " +myList);
            return true;

        }

        return false;


    }


    public boolean addSongToPlayList(String name, LinkedList<Song> myList){

        Song searchThisSong = findSong(name);

        if(searchThisSong !=null){
            myList.add(searchThisSong);
            return true;
        }

        else{

            System.out.println("Song not added to playlist");
            return false;
        }


    }



    private Song findSong(String song) {

        for(int i =0; i<album.size(); i++){
           Song songToSearch = this.album.get(i);

           if(songToSearch.getSongName().equals(song)){
               return songToSearch;
           }


        }
        return null;
    }
}
