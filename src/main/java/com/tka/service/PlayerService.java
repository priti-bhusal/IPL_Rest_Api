package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PlayerDao;
import com.tka.dao.PlayerDao;
import com.tka.model.Player;
import com.tka.model.Player;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerDao PlayerDao;
	
	public String addPlayer(Player Player) {
		
		String msg = PlayerDao.addPlayer(Player);
		
		return msg;
	}
	
	public List<Player> getAllPlayers() {
		
	List<Player> allPlayers = PlayerDao.getAllPlayers();		
		
	return allPlayers;
	}
	
	public Player getPlayerById(int id) {
		
	Player Player = PlayerDao.getPlayerById(id);
	return Player;
		
	}
	
	public String  deletePlayer(int id) {
    int status = PlayerDao.deletePlayer(id);
	
	if(status==0){
		return "Player Not found To Delete";
	}else {
		return "Player Deleted";
	}
	
	}
	
	public String updatePlayer(int id, Player Player) {
		int status = PlayerDao.updatePlayer(id, Player);
		if(status==0) {
			return "Player Not found To update";
		}else {
			return "Player Updated";
		}
	}

	
	

}
