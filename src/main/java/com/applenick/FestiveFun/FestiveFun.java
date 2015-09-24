package com.applenick.FestiveFun;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.applenick.FestiveFun.events.FestiveJoin;
import com.applenick.FestiveFun.fireworks.FireworksManager;
import com.applenick.FestiveFun.utils.Alog;

public class FestiveFun extends JavaPlugin {
	
	private static FestiveFun festive = null;	
	
	private FireworksManager fireworks;
	public FireworksManager getFireworkManager(){
		return fireworks;
	}
	
	public void onEnable(){
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.reloadConfig();
		startup();
	}
	
	
	private void startup(){
		festive = this;
		fireworks = new FireworksManager();
		setupListeners();
	}
		
	public static FestiveFun get(){
		return festive;
	}
	
	public void setupListeners(){
		PluginManager PM = getServer().getPluginManager();
		if(Config.joinFireworks()){
			PM.registerEvents(new FestiveJoin(), this);
			Alog.info(ChatColor.GREEN + "Join Fireworks Enabled");
		}
	}
	

}
