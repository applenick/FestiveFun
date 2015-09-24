package com.applenick.FestiveFun.holidays;

import java.util.Date;

/************************************************
			 Created By AppleNick
Copyright © 2015 , AppleNick, All rights reserved.
			http://applenick.com
 *************************************************/
public class Holiday {
	
	
	private String name;
	private String displayName;
	private Date date;
	
	
	public Holiday(String name, String displayName, Date date){
		this.name = name;
		this.displayName = displayName;
		this.date = date;
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

}
