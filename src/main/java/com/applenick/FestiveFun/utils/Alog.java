package com.applenick.FestiveFun.utils;

import org.bukkit.ChatColor;

import com.applenick.FestiveFun.FestiveFun;

public class Alog {
	
	public static void info(String info){
		FestiveFun.get().getServer().getConsoleSender().sendMessage(color(info));
	}
		
	public static String color(String colorMSG){
		return ChatColor.translateAlternateColorCodes('&', colorMSG);
	}
	
}
