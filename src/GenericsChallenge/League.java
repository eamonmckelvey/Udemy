package GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public  class League<T extends Team> {

   public String leagueName;
   public ArrayList<T> league = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T teamName){
        if(league.contains(teamName)){
            System.out.println("Team already added");
            return false;
        }

        else{
            this.league.add(teamName);
            return true;
        }
    }

    public void showTable(){
        Collections.sort(league);

//        for(int i =0; i<=league.size(); i++){
//            System.out.println(league.get(i).getTeamName());
//        }

        for(T t : league){
            System.out.println(t.getTeamName() + ": " + t.ranking());
        }
    }
}
