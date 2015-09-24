package com.applenick.FestiveFun.holidays;

import java.util.Date;

import org.bukkit.FireworkEffect;

/************************************************
			 Created By AppleNick
Copyright © 2015 , AppleNick, All rights reserved.
			http://applenick.com
 *************************************************/
public class Holiday {
	
	
	private String name;
	private String displayName;
	private Date date;
	private boolean fireworks;
	private FireworkEffect effect;
	
	
	public Holiday(){
	}


	/**
	 * @return the holiday name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the holiday name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the displayName for the holiday
	 */
	public String getDisplayName() {
		return displayName;
	}


	/**
	 * @param displayName the holiday displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	/**
	 * @return the date of the holiday
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the holiday date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the holiday firework effect
	 */
	public FireworkEffect getEffect() {
		return effect;
	}


	/**
	 * @param effect the holiday firework effect to set
	 */
	public void setEffect(FireworkEffect effect) {
		this.effect = effect;
	}


	/**
	 * @return has fireworks
	 */
	public boolean isFireworks() {
		return fireworks;
	}


	/**
	 * @param fireworks the fireworks to set
	 */
	public void setFireworks(boolean fireworks) {
		this.fireworks = fireworks;
	}
	
	
	

}
