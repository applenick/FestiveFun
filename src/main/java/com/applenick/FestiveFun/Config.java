package com.applenick.FestiveFun;

public class Config {
	
	public static boolean joinFireworks(){
		return Festive.get().getConfig().getBoolean("events.join-fireworks");
	}
	
	public static boolean joinMessage(){
		return Festive.get().getConfig().getBoolean("events.join-fireworks.join-message");
	}
	
	public static String getJoinMessage(){
		return Festive.get().getConfig().getString("messages.join-message");
	}

}
