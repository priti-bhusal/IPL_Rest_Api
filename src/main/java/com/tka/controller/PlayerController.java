package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Player;
import com.tka.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService PlayerService;
	
	@PostMapping("/api/Players")
	public String addPlayer(@RequestBody Player player) {
		
		String msg = PlayerService.addPlayer(player);
		
		return msg;
		
	}
	
	@GetMapping("/api/Players/all")
	public List<Player> getAllPlayers() {
		List<Player> allPlayers = PlayerService.getAllPlayers();
		return allPlayers;
	}
	
	@GetMapping("/api/Player")
	public Object getPlayerById(@RequestParam int id) {
		Player player = PlayerService.getPlayerById(id);
		
		if(player!=null) {
			return player;
		}else {
			return "Player not dound";
			
		}
	}
	
	@DeleteMapping("/api/Players/2{id}")
	public String deletePlayer(@PathVariable int id) {
		return PlayerService.deletePlayer(id);
	}
	
	@PutMapping("/api/Players/{id}")
		public String updatePlayer(@RequestBody Player Player, @PathVariable int id) {
		
	String msg = PlayerService.updatePlayer(id, Player);
		
		return msg;
		
		}

}
