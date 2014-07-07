package com.applenick.FestiveFun.holiday;

import java.util.Date;

import org.bukkit.ChatColor;
import org.joda.time.Instant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.applenick.FestiveFun.utils.Alog;

import de.jollyday.HolidayCalendar;
import de.jollyday.HolidayManager;

public class FestiveHolidays {
	
	public static DateTimeFormatter dtf = DateTimeFormat.forPattern("E, MMMM, ee, yyyy");
	
	public static void loginCheck(){		
		HolidayManager hm = HolidayManager.getInstance(HolidayCalendar.UNITED_STATES);
		Instant now = Instant.now();
		Date date = new Date();
		
		Alog.consoleMsg(ChatColor.GOLD + "Today is " + ChatColor.GREEN + now.toString(dtf));
	}

}
