package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Player;
import com.tka.model.Team;

@Repository
public class PlayerDao {
	
List<Team> players = new ArrayList<Team>();
	
	public PlayerDao() {
		
		
	}
	
	
	public String addTeam(Team player) {
		players.add(player);
		
		return "Added sucessfully";
		
	}
	
	
	public List<Team> getAllTeams() {
	 
		return players;
	}
	
	public Team getTeamById(int id) {
		for (Team player : players) {
			
			if(player.getTeamId()==id) {
				return player;
			}
			
			
		}
		return null;
		
	}
	
	public int deleteTeam(int id) {
		
	
		
		for (Team player : players) {
			
			if(player.getTeamId()==id) {
				players.remove(player);
				
			    return 1;
		}
	}
		
		return 0;
		
	}
	
	public int updateTeam(int id, Team player) {
		
		int status = deleteTeam(id);
		if(status==1) {
			players.add(player);
			return 1;
			
		}else {
			return 0;
		}
		
	
	}


	public Object addPlayer(int id) {
		
		return null;
	}


	public int updatePlayer(int id, Player player) {
		
		return 0;
	}


	public String addPlayer(Player player) {
		
		return null;
	}


	public List<Player> getAllPlayers() {
		
		return null;
	}


	public Player getPlayerById(int id) {
		
		return null;
	}


	public int deletePlayer(int id) {
		
		return 0;
	}


}
