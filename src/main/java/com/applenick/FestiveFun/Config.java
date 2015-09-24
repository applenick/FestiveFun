package com.applenick.FestiveFun;

/************************************************
			 Created By AppleNick
Copyright © 2015 , AppleNick, All rights reserved.
			http://applenick.com
 *************************************************/
public class Config {
	
	public static class Holidays{
		public static boolean isValentivesEnabled(){
			return FestiveFun.get().getConfig().getBoolean("holidays.valentines");
		}

		public static boolean isJuly4Enabled(){
			return FestiveFun.get().getConfig().getBoolean("holidays.july-4");
		}
		
		public static boolean isHalloweenEnabled(){
			return FestiveFun.get().getConfig().getBoolean("holidays.halloween");
		}
		
		public static boolean isChristmasEnabled(){
			return FestiveFun.get().getConfig().getBoolean("holidays.christmas");
		}
			
		public static boolean isNewYearsEnabled(){
			return FestiveFun.get().getConfig().getBoolean("holidays.new-years");
		}
	}
	
	public static class Options{
		public static int getDaysBefore(){
			return FestiveFun.get().getConfig().getInt("options.celebrate-days-before");
		}
		
		public static int getDaysAfter(){
			return FestiveFun.get().getConfig().getInt("options.celebrate-days-after");
		}
	}
	
	public static class Features{
		public static boolean hasFireworks(){
			return FestiveFun.get().getConfig().getBoolean("features.fireworks");
		}
		
		public static boolean hasSounds(){
			return FestiveFun.get().getConfig().getBoolean("features.sounds");
		}
		
		public static boolean hasSpecials(){
			return FestiveFun.get().getConfig().getBoolean("features.special");
		}
	}
	
	public static class MOTD{
		
		public static boolean useMOTD(){
			return  FestiveFun.get().getConfig().getBoolean("MOTD.enable");
		}
		
		public static String getValentines(){
			return FestiveFun.get().getConfig().getString("MOTD.valentines");
		}
		
		public static String getJuly4(){
			return FestiveFun.get().getConfig().getString("MOTD.july-4");
		}
		
		public static String getHalloween(){
			return FestiveFun.get().getConfig().getString("MOTD.halloween");
		}
		
		public static String getChristmas(){
			return FestiveFun.get().getConfig().getString("MOTD.christmas");
		}
		
		public static String getNewYears(){
			return FestiveFun.get().getConfig().getString("MOTD.new-years");
		}
	}
	
	

	
	

}