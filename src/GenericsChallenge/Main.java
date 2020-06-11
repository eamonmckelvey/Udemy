package GenericsChallenge;

public class Main {


    public static void main (String[] args){

        League<Team<FootballPlayer>> premierLeague = new League<>("Premier League");
        Team<FootballPlayer> manUtd = new Team<>("Manchester United");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal");

        premierLeague.addTeam(manUtd);
        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(arsenal);

        arsenal.matchResult(chelsea, 4 , 2);
        manUtd.matchResult(arsenal, 2, 2);
        chelsea.matchResult(manUtd, 0, 2);

        premierLeague.showTable();
    }
}


