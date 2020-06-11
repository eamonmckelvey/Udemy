package Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Press 1 to add player info or press 0 to quit");
//        Interfaces.Player player = new Interfaces.Player(27, "Eamon", "QB", "Patriots");
//        savePlayer(player);
//        loadPlayer(player);

        Player c = new Player();
        savePlayer(c);
        loadPlayer(c);

        //System.out.println(c);
        readValues();

       System.out.println(c);
    }


    public static ArrayList<String> readValues() {

        ArrayList<String> myValue = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Press 1 to add player info or press 0 to quit");


        while (!quit) {


                System.out.println("Make a choice");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {


                    case 0:
                        quit = true;
                        System.out.println("Quitting");
                        break;

                    case 1:


                        System.out.println("Enter a String");
                        String entered = scanner.nextLine();
                        myValue.add(index, entered);
                        index++;
                        break;

                }



            }



        System.out.println("Data entered is " + myValue);
        System.out.println("");

        return myValue;



    }






        public static void savePlayer(Saveable playerToSave) {

            for(int i =0; i < playerToSave.write().size(); i++){
                System.out.println("Saving " + playerToSave.write().get(i) + " to array");
            }
        }


     public static void loadPlayer(Saveable playerToLoad) {

         ArrayList<String> loadPlayer = readValues();

         playerToLoad.read(loadPlayer);
         System.out.println(loadPlayer.toString());
    }


}
