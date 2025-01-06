package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.MatchDao;
import com.tka.dao.MatchDao;
import com.tka.model.Match;
import com.tka.model.Match;

@Service
public class MatchService {
	
	@Autowired
	private MatchDao MatchDao;
	
	public String addMatch(Match Match) {
		
		String msg = MatchDao.addMatch(Match);
		
		return msg;
	}
	
	public List<Match> getAllMatchs() {
		
	List<Match> allMatchs = MatchDao.getAllMatchs();		
		
	return allMatchs;
	}
	
	public Match getMatchById(int id) {
		
	Match Match = MatchDao.getMatchById(id);
	return Match;
		
	}
	
	public String  deleteMatch(int id) {
    int status = MatchDao.deleteMatch(id);
	
	if(status==0){
		return "Match Not found To Delete";
	}else {
		return "Match Deleted";
	}
	
	}
	
	public String updateMatch(int id, Match Match) {
		int status = MatchDao.updateMatch(id, Match);
		if(status==0) {
			return "Match Not found To update";
		}else {
			return "Match Updated";
		}
	}

}
