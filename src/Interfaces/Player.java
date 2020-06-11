package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {

    private int age;
    private String name;
    private String position;
    private String team;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }


    public Player(int age, String name, String position, String team) {
        this.age = age;
        this.name = name;
        this.position = position;
        this.team = team;
    }

    // Empty constructor
    public Player() {
    }

    @Override
    public void read(List<String> myList) {

        if(!myList.isEmpty() && myList.size()>0 ){
            this.age = Integer.parseInt(myList.get(0));
            this.name = myList.get(1);
            this.position = myList.get(2);
            this.team = myList.get(3);


        }


    }

    @Override
    public List<String> write() {

        List<String> myList = new ArrayList<>();
        myList.add(0, "" + this.age);
        myList.add(1, this.name);
        myList.add(2, this.position);
        myList.add(3, this.team);

        return myList;
    }

    @Override
    public String toString() {
        return "Interfaces.Player{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}




