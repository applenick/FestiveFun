package com.applenick.FestiveFun;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.applenick.FestiveFun.fireworks.FireworksManager;

/************************************************
		  Created By AppleNick
Copyright © 2015 , AppleNick, All rights reserved.
		  http://applenick.com
*************************************************/
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
		//TODO Add Holiday Listeners
	}
	

}