package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlbumInner {

    private String albumName;
    private SongList songs;
    //private ArrayList<Song> myAlbum = new ArrayList<Song>();


    public AlbumInner(String albumName) {
        super();
       // this.album = new ArrayList<>();
        this.albumName = albumName;
        this.songs = new SongList();

    }


    public String getAlbumName() {
        return albumName;
    }

    public void addSong(String song , double duration) {

            //this.myAlbum.add(new SongList(test);
    }




    private class SongList{

        private ArrayList<Song> album ;

        public SongList() {

            this.album = new ArrayList<Song>();

        }

        public ArrayList<Song> getAlbum() {
            return album;
        }






        //

        boolean addSong(Song song){
          if(album.contains(song)){
              return false;
          }

          this.album.add(song);
          return true;

        }


        public Song findSong(String song) {

            for(int i =0; i<album.size(); i++){
                Song songToSearch = this.album.get(i);

                if(songToSearch.getSongName().equals(song)){
                    return songToSearch;
                }


            }
            return null;
        }
    }


    public boolean addSongToAlbum(String song, double duration){

       //calling the addSong method from inner class
      return this.songs.addSong(new Song(song, duration));
    }

//    public boolean addSongToPlayList(int trackNumber, LinkedList<Song> myList){
//
//        Song checkThisSong = this.songs.findSong(trac kNumber);
//        int index = trackNumber -1;
//
//        if((index >=0) && (index <= this.songs.size())){
//
//            myList.add(this.songs.get(index));
//            System.out.println("Track " +trackNumber + " added to " +myList);
//            return true;
//
//        }
//
//        return false;
//
//
//    }


    public boolean addSongToPlayList(String name, LinkedList<Song> myList){

        Song searchThisSong = this.songs.findSong(name);

        if(searchThisSong !=null){
            myList.add(searchThisSong);
            return true;
        }

        else{

            System.out.println("Song not added to playlist");
            return false;
        }


    }




}
