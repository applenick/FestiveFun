package com.applenick.FestiveFun;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.applenick.FestiveFun.events.FestiveJoin;
import com.applenick.FestiveFun.holiday.FestiveHolidays;
import com.applenick.FestiveFun.utils.Alog;

public class Festive extends JavaPlugin {
	
	private static Festive festive = null;	
	
	public void onEnable(){
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.reloadConfig();
	   
		startup();		
	}
	
	
	private void startup(){
		festive = this;
		setupFireworks();
		FestiveHolidays.loginCheck();
	}
	
	
	
	public static Festive get(){
		return festive;
	}
	
	public void setupFireworks(){
		PluginManager PM = getServer().getPluginManager();
		if(Config.joinFireworks()){
			PM.registerEvents(new FestiveJoin(), this);
			Alog.info("Join Fireworks Enabled");
		}
	}
	

}
