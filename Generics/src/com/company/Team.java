package com.company;

import java.util.ArrayList;

public class Team<T extends Player > implements Comparable<Team<T>>{
    private String name;
    int won=0;
    int lost = 0;
    int draw = 0;
    int played = 0;

     private ArrayList<T> members= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+" already on team. ");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" added to team " + this.name);
            return true;
        }

    }
    public int numPlayer(){
        return this.members.size();
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore){
        String message=null;
        if(ourScore>theirScore){
            won++;
            message=" beat ";
        }
        else if(ourScore<theirScore){
            lost++;
            message=" lost to ";

        }
        else if(ourScore==theirScore){
            draw++;
            message = " drew with ";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.name+ message + opponent.getName());
            matchResults(null,theirScore,ourScore);
        }

    }
    public  int ranking(){
        return (won*2)+draw;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){
            return -1;
        }
        else if(this.ranking()==team.ranking()){
            return 0;
        }
        return 1;
    }
}
