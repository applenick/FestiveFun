package com.applenick.FestiveFun.utils;

import java.util.logging.Logger;

import com.applenick.FestiveFun.Festive;
import com.sk89q.minecraft.util.commands.ChatColor;

public class Alog {

	private static Logger logger = Logger.getLogger("Minecraft");
	
	public static void info(String info){
		logger.info(info);
	}
	
	public static void warning(String warning){
		logger.severe(warning);
	}
	
	public static void consoleMsg(String msg){
		Festive.get().getServer().getConsoleSender().sendMessage(msg);
	}
	
	public static String color(String colorMSG){
		return ChatColor.translateAlternateColorCodes('&', colorMSG);
	}
	
}
