package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    //private static ArrayList<Album> playList = new ArrayList();
    public static void main(String[] args) {


        Album album = new Album("My Album");
        album.addSongToAlbum("Song 1", 4.50);
        album.addSongToAlbum("Song 2", 4.30);
        album.addSongToAlbum("Song 3", 2.50);
        album.addSongToAlbum("Song 4", 1.50);
//		album.addToAlbum("Song 4", 1.50);
//		album.addToAlbum("Song 4", 1.50);


        albums.add(album);

        album = new Album("My Album 2");
        album.addSongToAlbum("Song 5", 4.50);
        album.addSongToAlbum("Song 6", 4.30);
        album.addSongToAlbum("Song 7", 2.50);
        album.addSongToAlbum("Song 8", 1.50);


        albums.add(album);


        LinkedList<Song> myPlaylist = new LinkedList<Song>();
        albums.get(0).addSongToPlayList("Song 1", myPlaylist);
        albums.get(0).addSongToPlayList("Song 2", myPlaylist);
        albums.get(0).addSongToPlayList("Song 277", myPlaylist);
        albums.get(1).addSongToPlayList(3, myPlaylist);

        printMenu();
        play(myPlaylist);

    }

    private static void play(LinkedList<Song> myPlaylist) {

        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = myPlaylist.listIterator();

        if(myPlaylist.size()<0){
            System.out.println("No songs in the playlist");
        }

        else{
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit){

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){

                case 0 :
                    quit = true;
                    break;

                case 1:

                    if(!forward) {

                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }

                        forward = true;

                    }

                        if(listIterator.hasNext()){
                            System.out.println("Playing song " +listIterator.next());
                        }

                        else{
                            System.out.println("End of playlist");
                            forward = true;
                        }

                        break;

                        case 2:

                            if(forward) {

                                if (listIterator.hasPrevious()) {
                                    listIterator.previous();
                                }

                                forward = false;

                            }

                                if(listIterator.hasPrevious()){
                                    System.out.println("Playing song " +listIterator.previous());
                                }

                                else{
                                    System.out.println("Start of playlist");
                                    forward = false;
                                }

                                break;

                        case 3:
                            printList(myPlaylist);
                            break;

                        case 4:
                            printMenu();
                            break;

                        case 5:

                            if(myPlaylist.size()>0){
                                listIterator.remove();
                            }





                    }

            }

        }

    private static void printList(LinkedList<Song> myPlaylist) {

        for(int i =0; i<myPlaylist.size(); i++){
            System.out.println(myPlaylist.get(i).getSongName());
    }

}


    private static void printMenu() {
        // TODO Auto-generated method stub
        System.out.println("Available actions:\nSelect one of the following");
        System.out.println("0 - to quit\n");
        System.out.println("1 - Play next song\n");
        System.out.println("2 - Play previous song\n");
        System.out.println("3 - Print list\n");
        System.out.println("4 - Print menu");
        System.out.println("5 - Delete current song");

    }
    }

