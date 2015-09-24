package com.applenick.FestiveFun.events;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.applenick.FestiveFun.Config;
import com.applenick.FestiveFun.FestiveFun;
import com.applenick.FestiveFun.utils.Alog;

public class FestiveJoin implements Listener {
	
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent playerJoin){
		Player p = playerJoin.getPlayer();
		Location loc = p.getLocation();
		
		
		if(FestiveFun.get().getFireworkManager().getHoliday().isFireworks()){
			
		}
		
		
		if(Config.joinMessage()){
			p.sendMessage(Alog.color(Config.getJoinMessage()));
			p.playSound(loc, Sound.LEVEL_UP, 2, 2);
		}
		
	}
}
