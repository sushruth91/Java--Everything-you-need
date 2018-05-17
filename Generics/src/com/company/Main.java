package com.company;

public class Main {

    public static void main(String[] args) {
	CricketPlayer player1 = new CricketPlayer("Virat");
	FootballPlayer player2 = new FootballPlayer("Pogba");
	CricketPlayer player3 = new CricketPlayer("Rahul");
	Team<FootballPlayer> team1 = new Team<>("Manchester United");
	Team<FootballPlayer> team5 = new Team<>("Chelsea");
	//team1.addPlayer(player1);
	team1.addPlayer(player2);
	//team1.addPlayer(player3);
	//team1.addPlayer(player1);
    Team<CricketPlayer> team2= new Team<>("Royal Challengers Bangalore");
    team2.addPlayer(player3);
	team1.getName();
	System.out.println(team1.numPlayer());

	team1.matchResults(team5,3,0);
	System.out.println(team1.compareTo(team5));
    }
}
