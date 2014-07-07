package com.applenick.FestiveFun.utils;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.util.ChatPaginator;

import com.applenick.FestiveFun.Festive;
import com.google.common.base.Strings;

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
	
	public static String dashedChatMessage(String message, String c, ChatColor color) {
        message = " " + message + " ";
        String dashes = Strings.repeat(c, (ChatPaginator.GUARANTEED_NO_WRAP_CHAT_PAGE_WIDTH - ChatColor.stripColor(message).length() - 2) / 2);
        return color + dashes + message + color + dashes;
    }
	
}
