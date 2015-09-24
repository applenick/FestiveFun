package com.applenick.FestiveFun;

public class Config {
	
	public static boolean joinFireworks(){
		return FestiveFun.get().getConfig().getBoolean("events.join-fireworks");
	}
	
	public static boolean joinMessage(){
		return FestiveFun.get().getConfig().getBoolean("events.join-message");
	}
	
	public static String getJoinMessage(){
		return FestiveFun.get().getConfig().getString("messages.join-message");
	}

}
