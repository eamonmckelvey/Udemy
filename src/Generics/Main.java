package Generics;

public class Main   {

    public static void main(String[] args){

        FootballPlayer football = new FootballPlayer("Eamon");
        FootballPlayer football1 = new FootballPlayer("Nathan");
        FootballPlayer football2 = new FootballPlayer("Chris");

        TennisPlayer tennis = new TennisPlayer("John");
        RugbyPlayer rugby = new RugbyPlayer("Liam");

        Team<FootballPlayer> manUTD = new Team<>("Manchester United");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal");

        Team<TennisPlayer> usa = new Team<>("USA Olympics team");
        Team<RugbyPlayer> saleSharks = new Team<>("Sale Sharks");

        chelsea.addPlayer(football1);
        manUTD.addPlayer(football);
        arsenal.addPlayer(football2);

        manUTD.matchResult(chelsea, 1, 4);
        chelsea.matchResult(arsenal, 4, 1);

        System.out.println("Rankings");
        System.out.println(manUTD.getTeamName() + ": " + manUTD.ranking());
        System.out.println(chelsea.getTeamName() + ": " + chelsea.ranking());
        System.out.println(arsenal.getTeamName() + ": " + arsenal.ranking());
        //manUTD.ranking();
        //chelsea.ranking();
        System.out.println(manUTD.compareTo(chelsea));



    }
}
