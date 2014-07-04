package com.applenick.FestiveFun.events;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.applenick.FestiveFun.Config;
import com.applenick.FestiveFun.fireworks.FireworkUtil;
import com.applenick.FestiveFun.utils.Alog;

public class FestiveJoin implements Listener {
	
	private final FireworkEffect fwe = FireworkEffect.builder()
			.withColor(Color.RED)
			.withColor(Color.WHITE)
			.withColor(Color.AQUA)
			.withFlicker()
			.withTrail()
			.with(Type.STAR).build();
	
	@EventHandler
	public void onJoin(PlayerJoinEvent playerJoin){
		Player p = playerJoin.getPlayer();
		Location loc = p.getLocation();
		
		FireworkUtil.launchFirework(loc, fwe);
		
		if(Config.joinMessage()){
			p.sendMessage(Alog.color(Config.getJoinMessage()));
		}
		
	}
}
