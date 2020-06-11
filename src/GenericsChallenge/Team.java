package GenericsChallenge;

import Generics.Player;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String teamName;
     int gamesPlayed;
     int won = 0;
     int lost = 0;
     int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }


    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already a member of this team");
            return false;
        }

        else{
            members.add(player);
            System.out.println(player.getName() + " added to team " + this.teamName);
            return true;
        }
    }

    public int playerCount(){
        return this.members.size();

    }

    public void matchResult(Team opponent, int ourScore, int opponentScore){

        String message;

        if(ourScore > opponentScore){
            won++;
            message = " beat  ";
        }

        else if(opponentScore == ourScore){
            tied++;
            message = " drew with ";
        }
        else {
            lost++;
            message = " lost to ";
        }
        gamesPlayed++;
        if(opponent != null){
            System.out.println(this.getTeamName() + message + opponent.getTeamName() );
            opponent.matchResult(null, opponentScore, ourScore);
        }
    }

    public int ranking(){
      return (won * 3) + tied;

//        System.out.println(this.getTeamName() + " have " +points +  " points " + " after " +gamesPlayed + " games played");
//        return points;
    }

    @Override
    public int compareTo(Team<T> team) {

        if(this.ranking() > team.ranking()){
            return -1;
        }
        else{
            if(this.ranking() < team.ranking()){
                return 1;
            }
            else{
                return 0;
            }
        }

    }
}
