package com.applenick.FestiveFun.utils;

import org.bukkit.ChatColor;

import com.applenick.FestiveFun.FestiveFun;

/************************************************
			 Created By AppleNick
Copyright © 2015 , AppleNick, All rights reserved.
			http://applenick.com
 *************************************************/
public class AppleUtils {

	public static void info(String info){
		FestiveFun.get().getServer().getConsoleSender().sendMessage(color(info));
	}
		
	public static String color(String colorMSG){
		return ChatColor.translateAlternateColorCodes('&', colorMSG);
	}
	
}
