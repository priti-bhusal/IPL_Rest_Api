package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Match;
import com.tka.model.Team;

@Repository
public class MatchDao {

        List<Team> Matchs = new ArrayList<Team>();
	
	    public MatchDao() {
		
	 	
	   }
	
	
	   public String addTeam(Team Match) {
		 Matchs.add(Match);
		
		  return "Added sucessfully";
		
	}
	
	
	   public List<Team> getAllTeams() {
	 
		  return Matchs;
	 }
	
	    public Team getTeamById(int id) {
		    for (Team Match : Matchs) {
			
			   if(Match.getTeamId()==id) {
				  return Match;
			 }
			
			
		}
		return null;
		
	}
	
	public int deleteTeam(int id) {
		
	
		
		for (Team Match : Matchs) {
			
			if(Match.getTeamId()==id) {
				Matchs.remove(Match);
				
			    return 1;
		}
	}
		
		return 0;
		
	}
	
	public int updateTeam(int id, Team Match) {
		
		int status = deleteTeam(id);
		if(status==1) {
			Matchs.add(Match);
			return 1;
			
		}else {
			return 0;
		}
		
	
	}


	public String addMatch(Match match) {
		
		return null;
	}


	public List<Match> getAllMatchs() {
		
		return null;
	}


	public Match getMatchById(int id) {
		
		return null;
	}


	public int deleteMatch(int id) {
		
		return 0;
	}


	public int updateMatch(int id, Match match) {
		
		return 0;
	}

}
