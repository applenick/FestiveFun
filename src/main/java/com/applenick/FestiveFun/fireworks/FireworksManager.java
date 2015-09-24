package com.applenick.FestiveFun.fireworks;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;

import com.applenick.FestiveFun.holidays.Holiday;

/************************************************
			 Created By AppleNick
Copyright © 2015 , AppleNick, All rights reserved.
			http://applenick.com
 *************************************************/
public class FireworksManager {
	
	private Holiday holiday;
	
	public FireworksManager(){
	}
	
	public void setHoliday(Holiday holiday){
		this.holiday = holiday;
	}
	
	public Holiday getHoliday(){
		return holiday;
	}
	
	
	
	public static class FireworkEffects{
		public final FireworkEffect july4 = FireworkEffect.builder()
				.withColor(Color.RED)
				.withColor(Color.WHITE)
				.withColor(Color.BLUE)
				.withFlicker()
				.withTrail()
				.with(Type.STAR)
				.build();
		

		public final FireworkEffect halloween = FireworkEffect.builder()
				.withColor(Color.ORANGE)
				.withColor(Color.WHITE)
				.withFade(Color.BLACK)
				.withFlicker()
				.withTrail()
				.with(Type.BALL)
				.build();
	}
	
	
	
}
